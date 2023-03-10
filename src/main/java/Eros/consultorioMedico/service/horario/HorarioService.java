package Eros.consultorioMedico.service.horario;

import Eros.consultorioMedico.repository.model.Doctor;
import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.Set;

@Service
public class HorarioService implements  IHoarioServicio{

    @Autowired
    private IDoctorService doctorService;
    @Override
    public String asignarHorarioDoctor(Horario horario) {
        Doctor dr = doctorService.getDortor();
        System.out.println("doctor horario"+ horario);
        horario.comvertirLocalTime();
        dr.agregarHorarioDisponible(horario.getDay(), horario);
        return "Horario asignado";
    }

    ;


}
