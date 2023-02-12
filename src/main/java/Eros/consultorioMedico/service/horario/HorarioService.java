package Eros.consultorioMedico.service.horario;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;

@Service
public class HorarioService {

    @Autowired
    private IDoctorService doctorService ;

    public String asignarHorarioDoctor(){
        Doctor dr = doctorService.getDortor((DayOfWeek dia, Set< Horario > horarios);
        dr.agregarHorarioDisponible();
        return "Horario asignado";
    };



}
