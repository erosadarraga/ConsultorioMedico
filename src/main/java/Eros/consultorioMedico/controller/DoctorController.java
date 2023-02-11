package Eros.consultorioMedico.controller;

import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/doctor")
public class DoctorController {

    @Autowired
    private IDoctorService doctorService;

    @PostMapping("/horarios")
    public void establecerHorariosPost(@RequestBody Horario horario) {
        doctorService.establecerHorarios(horario);
    }

    @GetMapping("/horarios")
    public Map<String, Horario> listarHorarios() {
        return doctorService.listarHorarios();
    }


}
