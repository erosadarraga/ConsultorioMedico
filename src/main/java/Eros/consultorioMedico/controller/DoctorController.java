package Eros.consultorioMedico.controller;

import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.repository.model.Paciente;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/doctor")
public class DoctorController {

    @Autowired
    private IDoctorService doctorService;



    @GetMapping("/horarios")
    public Map<String, Horario> listarHorarios() {
        return doctorService.listarHorarios();
    }

    @PostMapping("/paciente")
    public void añadirPaciente(@RequestBody Paciente paciente){
            doctorService.añadirPaciente(paciente);
    }

    @PutMapping("paciente/{id}")
    public void modificarPacientePorId(@RequestBody Paciente paciente,@PathVariable int id){
        doctorService.modificarPacientePorId(id,paciente);
    }

    @DeleteMapping("paciente/{id}")
    public void deletePacientePorId(@PathVariable Integer id){
        doctorService.deletePacientePorId(id);
    }




}
