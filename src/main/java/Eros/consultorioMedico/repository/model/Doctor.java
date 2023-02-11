package Eros.consultorioMedico.repository.model;

import java.util.HashMap;
import java.util.Map;

public class Doctor {
    private String name;
    private Map<String, String> availability = new HashMap<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void setAvailability(String day, String hours) {
        availability.put(day, hours);
    }

    public String getAvailability(String day) {
        return availability.get(day);
    }

    public String getName() {
        return name;
    }
}
