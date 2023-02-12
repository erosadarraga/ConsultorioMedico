package Eros.consultorioMedico.repository.model;

import Eros.consultorioMedico.repository.model.Paciente;
import Eros.consultorioMedico.repository.model.TimeSlot;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Doctor {
    private String nombre;
    private Map<String, Horario> horarioDisponible;
    private Map<String, Paciente> pacientes;

    public Doctor(String nombre) {
        this.nombre = nombre;
        this.horarioDisponible = new HashMap<>();
        this.pacientes = new HashMap<>();
    }

    public Doctor() {
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, Horario> getHorarioDisponible() {
        return horarioDisponible;
    }

    public Map<String, Paciente> getPacientes() {
        return pacientes;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.put(paciente.getNombre(), paciente);
    }

    public void modificarPaciente(Paciente paciente) {
        pacientes.put(paciente.getNombre(), paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente.getNombre());
    }

    public void agregarHorarioDisponible(String dia, Horario horarios) {
        horarioDisponible.put(dia, horarios);
        System.out.println(horarioDisponible);
    }

    public void aceptarCita(Cita cita) {
        // lógica para aceptar la cita
    }

    public void cancelarCita(Cita cita) {
        // lógica para cancelar la cita
    }

    public void listarHistorialMedico(Paciente paciente) {
        // lógica para listar el historial médico de un paciente
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", horarioDisponible=" + horarioDisponible +
                ", pacientes=" + pacientes +
                '}';
    }
}