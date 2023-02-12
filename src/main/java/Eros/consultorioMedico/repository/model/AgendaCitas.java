package Eros.consultorioMedico.repository.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AgendaCitas {

    private List<Cita> citasAgendadas;
    private Map<String, Horario> horarioDisponible;

    public AgendaCitas(Map<String, Horario> horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
    }

    public boolean agendarCita(Horario fecha) {
        System.out.println("agendar citas");
        Horario horario = horarioDisponible.get(fecha.getDay());
        if (horario == null) {
            System.out.println("retorno null");
            return false;
        }
        if (!horario.isDisponible(fecha.getStartTime())) {
            System.out.println("no es disponible");
            return false;
        }
        horario.ocuparHorario(fecha.getStartTime(), fecha.getEndTime());
        System.out.println("Todo bien");
        return true;

    };
}
