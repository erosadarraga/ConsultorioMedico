package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Horario;

import java.time.LocalTime;

public interface ICitaService {
    public void agendarCita(String day, LocalTime startTime, int idPaciente);

    public void establecerHorarios (Horario horario,int diaNum);
}
