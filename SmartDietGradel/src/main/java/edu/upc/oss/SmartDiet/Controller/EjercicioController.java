package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Entity.Ejercicio;
import edu.upc.oss.SmartDiet.Repository.EjercicioRepository;
import edu.upc.oss.SmartDiet.Service.AlimentoService;
import edu.upc.oss.SmartDiet.Service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "SmartDiet/Ejercicio")
public class EjercicioController {

    @Autowired
    EjercicioService ejercicioService;
    @Autowired
    AlimentoService alimentoService;
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

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public void updateEjercicio(@PathVariable int id, @RequestBody Ejercicio exercise){
        exercise.setIdpdejercicio(id);
        ejercicioService.actualizarEjercicio(exercise);
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void deleteEstadoFisico(@PathVariable int id){
        ejercicioService.deleteEjercicio(id);
    }

    @RequestMapping(path = "puntaje/{puntaje}", method = RequestMethod.GET)
    public List<Ejercicio> getEjerciciosFecha(@PathVariable int puntaje){


        return ejercicioService.getEjerciciosporpuntaje(puntaje);
    }



}
