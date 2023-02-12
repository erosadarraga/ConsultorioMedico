package Eros.consultorioMedico.repository.model;

import Eros.consultorioMedico.repository.template.DayOfWeek;
import Eros.consultorioMedico.repository.template.Persona;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private static Integer contadorId = 1;

    private Integer id;
    private List<Cita> historialCitas=new ArrayList<Cita>();

    public Paciente(String nombre, String apellido, int edad, String informacionPersonal) {
        super(nombre, apellido);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = contadorId++;
        this.edad = edad;
        this.historialCitas = new ArrayList<Cita>();
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public List<Cita> getHistorialCitas() {
        return historialCitas;
    }

    public void agregarCitaAlHistorial(Cita cita) {
        this.historialCitas.add(cita);
    }

    public void eliminarCitaDelHistorial(Cita cita) {
        this.historialCitas.remove(cita);
    }

    public Integer getId() {
        return id;
    }

    public Integer setId(Integer id) {
        this.id = id;
        return id;
    }

    public void setHistorialCitas(List<Cita> historialCitas) {
        this.historialCitas = historialCitas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                ", historialCitas=" + historialCitas +
                '}';
    }
}