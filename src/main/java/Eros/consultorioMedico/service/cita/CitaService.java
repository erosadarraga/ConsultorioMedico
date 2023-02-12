package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;
import Eros.consultorioMedico.repository.model.TimeSlot;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class CitaService implements ICitaService{

    @Autowired
    private IDoctorService doctorService;



    @Override
    public void agendarCita(Horario horario, Integer idPaciente) {
        Map<Integer, Paciente>  pacientes =doctorService.getDortor().getPacientes();
       Paciente paciente = pacientes.get(idPaciente);



    }

    @Override
    public void establecerHorarios(Horario horario, int diaNum) {

    }


}
