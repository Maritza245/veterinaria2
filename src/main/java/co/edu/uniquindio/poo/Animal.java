package co.edu.uniquindio.poo;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String peso;

    public Animal(String nombre, int edad, String peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }

    public void comer(){
        System.out.println("El animal está comiendo.");
    }

    public void dormir(){
        System.out.println("El animal está durmiendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Peso: " + peso;
    }
}
