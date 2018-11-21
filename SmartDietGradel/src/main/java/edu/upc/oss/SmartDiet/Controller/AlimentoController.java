package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.AliasEvent;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/Alimento")
public class AlimentoController {

    @Autowired
    AlimentoService alimentoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Alimento> getDatoAlimento() {
        return alimentoService.getAlimentos();
    }



    @RequestMapping(method = RequestMethod.POST)
    public Alimento createAlimento(@RequestBody Alimento alimento){
        return alimentoService.createAlimento(alimento);
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public void updateAlimento(@PathVariable int id, @RequestBody Alimento alimento){

        alimentoService.actualizarAlimento(alimento);
    }


//como se haría el eliminar
    @RequestMapping(path = "/{id}" ,method = RequestMethod.DELETE)
    public void deleteAlimento(@PathVariable(value = "id") int id){
        alimentoService.deleteAlimento(id);
    }

    @RequestMapping(path = "/fecha/{date}", method = RequestMethod.GET)
    public List<Alimento> getAlimentosFecha(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        return alimentoService.getAlimentosPorFecha(date);
    }



}
