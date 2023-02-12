package Eros.consultorioMedico.repository.model;

import java.util.ArrayList;
import java.util.List;

public class AgendaCitas {

    private List<Cita> citasAgendadas;
    private List<Horario> horariosDisponibles;

    public AgendaCitas() {
        this.citasAgendadas = new ArrayList<>();
        this.horariosDisponibles = new ArrayList<>();
    }

    public boolean agendarCita(Cita cita) {
        for (Horario horarioDisponible : horariosDisponibles) {
            if (horarioDisponible.getDay().equals(cita.getDiaSemana())
                    && horarioDisponible.getStartTime().getHour() <= cita.getHoraInicio().getHour()
                    && horarioDisponible.getEndTime().getHour() >= cita.getHoraFin().getHour()) {
                citasAgendadas.add(cita);
                horariosDisponibles.remove(horarioDisponible);
                return true;
            }
        }
        return false;
    }
}
