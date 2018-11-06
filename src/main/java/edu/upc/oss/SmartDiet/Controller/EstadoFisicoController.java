package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.EstadoFisico;
import edu.upc.oss.SmartDiet.Service.EstadoFisicoService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/EstadoFisico")
public class EstadoFisicoController {

    @Autowired
    EstadoFisicoService estadoFisicoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<EstadoFisico> getEstadosFisicos() {
        return estadoFisicoService.getAllEstadoFisicos();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public EstadoFisico getEstadosFisicoById(@PathVariable(value = "id") int id){
        return estadoFisicoService.getEstadoFisicoId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public EstadoFisico createEstadosFisico(@RequestBody EstadoFisico tipo){
        return estadoFisicoService.createEstadoFisico(tipo);
    }
}
