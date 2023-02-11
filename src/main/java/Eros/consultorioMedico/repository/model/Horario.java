package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;

public class Horario {
    private LocalTime startTime;
    private LocalTime endTime;
    private int horacomienzo;
    private int horaFinal;
    private String day;

    public Horario(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDay() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public int getHoracomienzo() {
        return horacomienzo;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

}
