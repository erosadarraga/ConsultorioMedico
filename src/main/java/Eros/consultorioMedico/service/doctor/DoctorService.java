package Eros.consultorioMedico.service.doctor;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService implements IDoctorService {
    Doctor dr = new Doctor("Dr. Ramiro Fernandez");


    public Doctor getDortor(){
        return dr;
    }


    @Override
    public Map<String, Horario> listarHorarios() {
        return null;
    }

    @Override
    public void añadirPaciente(Paciente paciente) {

    }

    @Override
    public void modificarPacientePorId(int idPaciente, Paciente paciente) {

    }

    @Override
    public List<Paciente> getListPacientes() {
        return null;
    }
}
