package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Ejercicio;
import edu.upc.oss.SmartDiet.Repository.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "SmartDiet/Ejercicio")
public class EjercicioController {

    @Autowired
    EjercicioRepository ejercicioRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ejercicio> getEjercicio()
    {
        List<Ejercicio> list = new ArrayList<>();
        ejercicioRepository.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Ejercicio getEjercicioById(@PathVariable(value = "id") int id){
        return ejercicioRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ejercicio createEjercicio(@RequestBody Ejercicio exercise){
        return ejercicioRepository.save(exercise);
    }

}
