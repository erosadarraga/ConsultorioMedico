package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Doctor {
    private String name;
    private Map<String, Horario> Horarios = new HashMap<>();

    public Doctor(String name) {
        this.name = name;

    }

    public void setAvailability(String day, LocalTime startTime, LocalTime endTime) {
        this.Horarios.put(day, new Horario(startTime,  endTime));

    }

    public Doctor() {
    }

    public Map<String, Horario> getAvailability() {

        return Horarios;
    }

    public Horario getAvailability(String day) {
        return Horarios.get(day);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", Horarios=" + Horarios +
                '}';
    }
}
