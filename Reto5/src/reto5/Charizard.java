
package reto5;

public class Charizard extends Pokemon {
    
    public Charizard(String nombre,byte nivel, int puntajeSalud){
        setNombre(nombre);
        setNivel(nivel);
        setPuntajeSalud(puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {   
        Pokemon charizard = new Charizard(this.getNombre(),this.getNivel(),this.getPuntajeSalud());        
        try{
            throw new NoEvolucionaException("El Pokemon no puede evolucionar mas");
        }catch(NoEvolucionaException e){
            System.out.println(e.getMessage());
        }       
        return charizard;
    }

    @Override
    public void gritar() {
        System.out.println("¡¡Charizard!!");
    }
}
