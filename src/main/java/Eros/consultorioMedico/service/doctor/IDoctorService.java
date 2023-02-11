package Eros.consultorioMedico.service.doctor;

import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;

import java.time.LocalTime;
import java.util.Map;

public interface IDoctorService {

    public void establecerHorarios (Horario horario);
    public Map<String, Horario> listarHorarios();
    public  void añadirPaciente(Paciente paciente);

    public void modificarPacientePorId(int idPaciente, Paciente paciente);
}
