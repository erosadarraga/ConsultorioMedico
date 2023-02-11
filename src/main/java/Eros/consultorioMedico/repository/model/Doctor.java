package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Map<String, Horario> Horarios = new HashMap<>();
    private List<Paciente> pacientes;
    private static int contadorIdPaciente = 1;


    public Doctor(String name) {
        this.name = name;
        this.id = idCounter++;
        this.pacientes = new ArrayList<Paciente>();

    }

    public void setAvailability(String day, LocalTime startTime, LocalTime endTime) {
        this.Horarios.put(day, new Horario(startTime, endTime));

    }

    public Doctor() {
    }

    public Map<String, Horario> getAvailability() {

        return Horarios;
    }

    public Horario getAvailability(String day) {
        return Horarios.get(day);
    }
    public void agregarPaciente(Paciente paciente) {
        paciente.setId(contadorIdPaciente++);
        this.pacientes.add(paciente);
        System.out.println(paciente.toString());
        System.out.println(pacientes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Horario> getHorarios() {
        return Horarios;
    }

    public void setHorarios(Map<String, Horario> horarios) {
        Horarios = horarios;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void modificarPacientePorId(int idPaciente, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        for (Paciente paciente : this.pacientes) {
            if (paciente.getId() == idPaciente) {
                paciente.setNombre(nuevoNombre);
                paciente.setApellido(nuevoApellido);
                paciente.setEdad(nuevaEdad);
                System.out.println(paciente);
                System.out.println(pacientes);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", Horarios=" + Horarios +
                '}';
    }
}
