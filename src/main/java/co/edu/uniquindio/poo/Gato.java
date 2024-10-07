package co.edu.uniquindio.poo;

public class Gato extends AnimalDomestico{
    private String colorPelaje;

    public Gato(String nombre, int edad, String peso, Dueño dueño, boolean requiereCuidadoEspecial, String colorPelaje, Veterinario veterinario2){
        super(nombre, edad, peso, dueño, requiereCuidadoEspecial, veterinario2);
        this.colorPelaje=colorPelaje;
    }

    public void comer(){
        System.out.println("El animal está comiendo.");
    }

    public void dormir(){
        System.out.println("El animal está durmiendo.");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Color Pelaje: " + colorPelaje;
    }
}
