package Eros.consultorioMedico.service.cita;

import Eros.consultorioMedico.repository.model.*;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;


@Service
public class CitaService implements ICitaService {

    @Autowired
    private IDoctorService doctorService;


    @Override
    public String agendarCita(Horario horario, Integer idPaciente) {
        Doctor dr = doctorService.getDortor();
        Map<Integer, Paciente> pacientes = dr.getPacientes();
        horario.comvertirLocalTime();
        System.out.println("horario" + horario);
        Map<String, Horario> horarioDisponible = dr.getHorarioDisponible();
        AgendaCitas agenda = new AgendaCitas(horarioDisponible);
        Paciente paciente = pacientes.get(idPaciente);
        if (agenda.agendarCita(horario)) {
            Cita citanew = new Cita(paciente.getNombre(), horario.getDay(), horario.getStartTime(), horario.getEndTime());
            paciente.agregarCitaAlHistorial(citanew);

            return citanew.retorno();
        }
        return "No se pudo agendar cita";
    }


    @Override
    public void aceptarcita(Integer idpaciente, Integer idcita) {
        idcita= idcita -1;
        Doctor dr = doctorService.getDortor();
        Map<Integer, Paciente> pacientes = dr.getPacientes();
        Paciente paciente = pacientes.get(idpaciente);
        if( paciente != null || idcita != null){
            List<Cita> citas = paciente.getHistorialCitas();
            Cita cita = citas.get(idcita);
            cita.setEstadoCita("Aceptado");
        }

    }

    ;

    @Override
    public void rechazarcita(Integer idpaciente, Integer idcita) {
        idcita= idcita -1;
        Doctor dr = doctorService.getDortor();
        Map<Integer, Paciente> pacientes = dr.getPacientes();
        Paciente paciente = pacientes.get(idpaciente);
        if( paciente != null || idcita != null){
            List<Cita> citas = paciente.getHistorialCitas();
            Cita cita = citas.get(idcita);
            cita.setEstadoCita("Cancelado");
        }

    }

    ;
    @Override
    public List<Cita> listarHistorial(Integer idpaciente) {
        Doctor dr = doctorService.getDortor();
        Map<Integer, Paciente> pacientes = dr.getPacientes();
        Paciente paciente = pacientes.get(idpaciente);
        return paciente.getHistorialCitas();
    }

    ;


}
