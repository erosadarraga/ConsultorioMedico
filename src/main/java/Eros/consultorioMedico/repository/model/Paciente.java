package Eros.consultorioMedico.repository.model;

import Eros.consultorioMedico.repository.template.DayOfWeek;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private static Integer contadorId = 1;

    private Integer id;
    private String informacionPersonal;
    private List<Cita> historialCitas;

    public Paciente(String nombre, String apellido, int edad, String informacionPersonal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = contadorId++;
        this.edad = edad;
        this.informacionPersonal = informacionPersonal;
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

    public String getInformacionPersonal() {
        return informacionPersonal;
    }

    public void setInformacionPersonal(String informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
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
                ", informacionPersonal='" + informacionPersonal + '\'' +
                ", historialCitas=" + historialCitas +
                '}';
    }
}