package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.Horario;
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
    Map<DayOfWeek, Set<TimeSlot>> availability = new HashMap<>();
    Set<TimeSlot> timeSlots = new HashSet<>();

    @Override
    public void establecerHorarios(Horario horario, int diaNum) {
        timeSlots.add(new TimeSlot(LocalTime.of(horario.getHoracomienzo(), 0), LocalTime.of(horario.getHoraFinal(), 0)));
        availability.put(DayOfWeek.of(diaNum), timeSlots);

    }

    @Override
    public void agendarCita(String day, LocalTime startTime, int idPaciente) {

    }


}
