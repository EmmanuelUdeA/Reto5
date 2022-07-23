
// ALEJANDRO BECERRA ACEVEDO

package reto5;


public class Reto5 {
    public static void main(String[] args) {

        Pokemon otroPokemon = new Charmander("fuego",(byte)75,200);
        Pokemon miPokemon = new Pikachu("fito",(byte)50,100);
        Pokemon ultimoPokemon = new Squirtle("tortuga",(byte)70,150);

        System.out.println(miPokemon.getNombre() + " " + miPokemon.getNivel() + " " + miPokemon.getPuntajeSalud() + " ");
        System.out.println(otroPokemon.getNombre() + " " + otroPokemon.getNivel() + " " + otroPokemon.getPuntajeSalud() + " ");
        
        miPokemon.gritar();  
        
        otroPokemon.gritar();
        
        
        Pokebola miPokebola = new Pokebola();
        Pokebola otraPokebola = new Pokebola();
        
        
        miPokebola.setTamano(1);
        miPokebola.setPokemon(miPokemon);
        miPokebola.getPokemon().gritar();
        
        Pokemon evolucionado = otroPokemon.evolucionar();
        evolucionado.gritar();     
        
        Pokemon evolucionado1 = evolucionado.evolucionar();
        evolucionado1.gritar();
        
        otraPokebola.setTamano(3);
        otraPokebola.setPokemon(evolucionado1);
        otraPokebola.getPokemon().gritar();
        
        otroPokemon.gritar();

        System.out.println(miPokebola.getPokemon().getNombre() + " " + miPokebola.getPokemon().getNivel() + " " + miPokebola.getPokemon().getPuntajeSalud());
        System.out.println(miPokemon.getNombre() + " " + miPokemon.getNivel() + " " + miPokemon.getPuntajeSalud());
        
        Pokemon evolucion2 = evolucionado1.evolucionar();   
    }
    
}
