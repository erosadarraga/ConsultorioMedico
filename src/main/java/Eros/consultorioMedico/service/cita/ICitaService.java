package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Horario;

import java.time.LocalTime;

public interface ICitaService  {
    public String agendarCita(Horario horario, Integer idPaciente);
    public void aceptarcita(Integer idpaciente, Integer idcita);
    public void rechazarcita(Integer idpaciente, Integer idcita);


}
