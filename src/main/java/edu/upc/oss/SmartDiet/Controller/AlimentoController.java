package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Repository.AlimentoRepository;
import edu.upc.oss.SmartDiet.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/Alimentos")
public class AlimentoController {

    @Autowired
    AlimentoService alimentoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Alimento> getAlimento() {

        return alimentoService.getAlimentos();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Alimento getAlimentoById(@PathVariable(value = "id") int id){
        return alimentoService.getAlimentobyId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Alimento createAlimento(@RequestBody Alimento alimento){
        return alimentoService.createAlimento(alimento);
    }

    @RequestMapping(path = "/idUsuario/{idUsuario}",method = RequestMethod.GET)
    public List<Alimento> getAlimentoidUsuario(@PathVariable(value = "idUsuario") int idUsuario )
    {
        return alimentoService.getByIdAlimento(idUsuario);
    }

    @RequestMapping(path = "/{id}" ,method = RequestMethod.DELETE)
    public void deleteAlimento(@PathVariable(value = "id") int id){
        alimentoService.deleteAlimento(id);
    }
}
