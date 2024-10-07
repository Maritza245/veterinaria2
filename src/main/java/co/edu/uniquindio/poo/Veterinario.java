package co.edu.uniquindio.poo;

public class Veterinario extends Persona{
    private String idVeterinario;
    private String especializacion;

    Veterinario(String nombre, String apellido, String correo, String telefono, String idVeterinario, String especializacion){
        super(nombre, apellido, correo, telefono);
        this.idVeterinario=idVeterinario;
        this.especializacion=especializacion;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return "\n\n" +
               "Nombre: " +getNombre() + "\n" +
               "Apellido: " +getApellido() + "\n" +
               "Correo: " +getCorreo() + "\n" +
               "Telefono: " +getTelefono() + "\n" +
               "IdVeterinario: " + getIdVeterinario() + "\n" +
               "Especializacion: " + getEspecializacion();
    }
}
