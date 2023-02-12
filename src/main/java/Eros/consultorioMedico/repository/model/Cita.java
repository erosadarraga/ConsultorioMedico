package Eros.consultorioMedico.repository.model;

import java.time.LocalTime;

public class Cita {
    private String paciente;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private static Integer contadorId = 1;

    private Integer id;
    private String estadoCita= "En espera ";

    public Cita(String paciente, String diaSemana, LocalTime horaInicio, LocalTime horaFin) {
        this.paciente = paciente;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.id = contadorId++;
        this.horaFin = horaFin;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String  retorno(){
        return "Cita agendada a las :"+this.horaInicio.toString()+" hasta las "+this.horaFin.toString();
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

    @Override
    public String toString() {
        return "Cita{" +
                "paciente='" + paciente + '\'' +
                ", diaSemana='" + diaSemana + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", id=" + id +
                ", estadoCita='" + estadoCita + '\'' +
                '}';
    }
}