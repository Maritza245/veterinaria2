package co.edu.uniquindio.poo;

public class AnimalSalvaje extends Animal{
    private String habitadNatural;
    private boolean comportamientoInstitivo;
    private Veterinario veterinario;

    public AnimalSalvaje(String nombre, int edad, String peso, String habitadNatural, boolean comportamientoInstitivo, Veterinario veterinario){
        super(nombre, edad, peso);
        this.habitadNatural=habitadNatural;
        this.comportamientoInstitivo=comportamientoInstitivo;
        this.veterinario=veterinario;
    }

    public String getHabitadNatural() {
        return habitadNatural;
    }

    public void setHabitadNatural(String habitadNatural) {
        this.habitadNatural = habitadNatural;
    }

    public boolean isComportamientoInstitivo() {
        return comportamientoInstitivo;
    }

    public void setComportamientoInstitivo(boolean comportamientoInstitivo) {
        this.comportamientoInstitivo = comportamientoInstitivo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Habitad Natural: " + habitadNatural + "\n" +
               "Comportamiento Institivo: " + comportamientoInstitivo + "\n\n" +
               "Veterinario " + getVeterinario() + "\n";
    }
}
