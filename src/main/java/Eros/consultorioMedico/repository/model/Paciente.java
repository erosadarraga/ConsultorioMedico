package Eros.consultorioMedico.repository.model;

public class Paciente {
    private static int idCounter = 1;
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Paciente(String nombre, String apellido, int edad) {
        this.id = idCounter++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Paciente() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Paciente.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}