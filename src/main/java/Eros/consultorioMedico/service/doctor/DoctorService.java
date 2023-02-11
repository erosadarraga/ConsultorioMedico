package Eros.consultorioMedico.service.doctor;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Map;

@Service
public class DoctorService implements IDoctorService {
    Doctor dr = new Doctor("Dr. Ramiro Fernandez");

    @Override
    public void establecerHorarios(Horario horario) {
        System.out.println(horario);
        if ( horario != null) {
            dr.setAvailability(horario.getDay(), LocalTime.of(horario.getHoracomienzo(), 0), LocalTime.of(horario.getHoraFinal(), 0));
        }

    }

    @Override
    public Map<String, Horario> listarHorarios() {
        return dr.getAvailability();
    }

    @Override
    public void añadirPaciente(Paciente paciente) {
        dr.agregarPaciente(paciente);
    }

    @Override
    public void modificarPacientePorId(int idPaciente, Paciente paciente) {

    }

    ;


}
