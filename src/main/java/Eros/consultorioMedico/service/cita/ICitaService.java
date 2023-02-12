package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Horario;

import java.time.LocalTime;

public interface ICitaService {
    public String agendarCita(Horario horario, Integer idPaciente);

    public void establecerHorarios (Horario horario,int diaNum);
}
