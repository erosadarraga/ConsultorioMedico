package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;
import java.util.Date;

public class Horario {
    private LocalTime startTime;
    private LocalTime endTime;
    private int horacomienzo;
    private int minutocomienzo;

    public int getMinutocomienzo() {
        return minutocomienzo;
    }

    public int getMinutofinal() {
        return minutofinal;
    }

    public boolean isDisponible() {
        return disponible;
    }

    private int minutofinal;
    private int horaFinal;
    private String day;
    private boolean disponible;

    public Horario(LocalTime startTime, LocalTime endTime,String day) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.disponible = true;
    }

    public Horario() {
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
        this.startTime= LocalTime.of(this.horacomienzo, this.minutocomienzo);
        System.out.println("convercion "+this.horacomienzo +this.minutocomienzo);
        this.endTime= LocalTime.of(this.horaFinal, this.minutofinal);
    }
    public boolean isDisponible(LocalTime hora) {
        System.out.println(hora);
        return hora.isAfter(startTime) && hora.isBefore(endTime);
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void ocuparHorario(LocalTime horaInicio, LocalTime horaFin) {
        if (horaInicio.isAfter(this.startTime) && horaFin.isBefore(this.endTime)) {
            this.disponible = false;
        } else {
           String res= ("El horario de inicio y fin de la cita deben estar dentro del horario disponible");
        }
    }

    public void liberarHorario() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", horacomienzo=" + horacomienzo +
                ", minutocomienzo=" + minutocomienzo +
                ", minutofinal=" + minutofinal +
                ", horaFinal=" + horaFinal +
                ", day='" + day + '\'' +
                ", disponible=" + disponible +
                '}';
    }

}
