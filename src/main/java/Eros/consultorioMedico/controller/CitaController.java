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

    @PostMapping("/agendar/{id}")
    public String agendarCita(@RequestBody Horario horario,@PathVariable Integer id){
       return iCitaService.agendarCita(horario,id);
    };

    @PostMapping("/aceptar/{idpaciente}/{idcita}")
    public int aceptarCita(@PathVariable Integer idpaciente, Integer idcita){
        iCitaService.aceptarcita(idpaciente,idcita);
        return idpaciente+idpaciente;
    }

    @PostMapping("/aceptar/{idpaciente}/{idcita}")
    public int cancelarCita(@PathVariable Integer idpaciente, Integer idcita){
        iCitaService.rechazarcita(idpaciente,idcita);
        return idpaciente+idpaciente;
    }


}
