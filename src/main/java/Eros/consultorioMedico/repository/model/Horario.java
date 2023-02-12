package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;

public class Horario {
    private LocalTime startTime;
    private LocalTime endTime;
    private int horacomienzo;
    private int horaFinal;
    private String day;

    public Horario(LocalTime startTime, LocalTime endTime,String day) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
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

    public void comvertirLocalTime(){
        this.startTime= LocalTime.of(this.horacomienzo, 30);
        this.endTime= LocalTime.of(this.horaFinal, 30);
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", horacomienzo=" + horacomienzo +
                ", horaFinal=" + horaFinal +
                ", day='" + day + '\'' +
                '}';
    }
}
