package Eros.consultorioMedico.controller;


import Eros.consultorioMedico.repository.model.Horario;
import Eros.consultorioMedico.service.cita.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cita")
public class CitaController {

    @Autowired
    private ICitaService iCitaService;






}
