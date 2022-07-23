
package reto5;


public class Raichu extends Pokemon{
    
    public Raichu(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }  

    @Override
    public Pokemon evolucionar() {   
        Pokemon Raichu = new Raichu(this.getNombre(),this.getNivel(),this.getPuntajeSalud());        
        try{
            throw new NoEvolucionaException("El Pokemon no puede evolucionar mas");
        }catch(NoEvolucionaException e){
            System.out.println(e.getMessage());
        }       
        return Raichu;
    }
    
    @Override
    public void gritar() {
        System.out.println("¡¡Raichu!!");
    }
    
}
