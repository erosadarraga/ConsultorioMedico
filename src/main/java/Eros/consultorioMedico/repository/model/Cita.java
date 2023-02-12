package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;

public class Cita {
    private Paciente paciente;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Cita(Paciente paciente, String diaSemana, LocalTime horaInicio, LocalTime horaFin) {
        this.paciente = paciente;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}