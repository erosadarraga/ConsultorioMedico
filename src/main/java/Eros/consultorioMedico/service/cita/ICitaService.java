package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Cita;
import Eros.consultorioMedico.repository.model.Horario;

import java.time.LocalTime;
import java.util.List;

public interface ICitaService  {
    public String agendarCita(Horario horario, Integer idPaciente);
    public void aceptarcita(Integer idpaciente, Integer idcita);
    public void rechazarcita(Integer idpaciente, Integer idcita);
    public List<Cita> listarHistorial(Integer idpaciente);


}
