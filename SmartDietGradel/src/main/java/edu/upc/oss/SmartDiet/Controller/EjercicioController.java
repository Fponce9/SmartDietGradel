package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Ejercicio;
import edu.upc.oss.SmartDiet.Repository.EjercicioRepository;
import edu.upc.oss.SmartDiet.Service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "SmartDiet/Ejercicio")
public class EjercicioController {

    @Autowired
    EjercicioService ejercicioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ejercicio> getEjercicio()
    {
        return ejercicioService.getEjercicios();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Ejercicio getEjercicioById(@PathVariable(value = "id") int id){
        return ejercicioService.getEjercicioById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ejercicio createEjercicio(@RequestBody Ejercicio exercise){
        return ejercicioService.crearEjercicio(exercise);
    }

}
