package Eros.consultorioMedico.service.doctor;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public interface IDoctorService {


    public Map<String, Horario> listarHorarios();
    public  void añadirPaciente(Paciente paciente);

    public void modificarPacientePorId(int idPaciente, Paciente paciente);

    public List<Paciente> getListPacientes();
    public Doctor getDortor();
}
