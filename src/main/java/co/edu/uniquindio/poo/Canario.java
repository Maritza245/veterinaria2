package co.edu.uniquindio.poo;

public class Canario extends AnimalDomestico{

    public Canario(String nombre, int edad, String peso, Dueño dueño2, boolean requiereCuidadoEspecial, Veterinario veterinario){
        super(nombre, edad, peso, dueño2, requiereCuidadoEspecial, veterinario);
    }

    public void comer(){
        System.out.println("El animal está comiendo.");
    }

    public void dormir(){
        System.out.println("El animal está durmiendo.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
