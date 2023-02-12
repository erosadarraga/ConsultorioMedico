package Eros.consultorioMedico.controller;


import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.service.horario.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("api/horario")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping("/asignar")
    public String postHorario(@RequestBody Horario horario) {
        horarioService.asignarHorarioDoctor(horario);
        return "hora";
    }

    ;

}
