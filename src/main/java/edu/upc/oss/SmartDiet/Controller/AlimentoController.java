package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/Alimentos")
public class AlimentoController {

    @Autowired
    AlimentoRepository repositoryAlimento;

    @RequestMapping(method = RequestMethod.GET)
    public List<Alimento> getAlimento() {

        List<Alimento> list = new ArrayList<>();
        repositoryAlimento.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Alimento getAlimentoById(@PathVariable(value = "id") int id){
        return repositoryAlimento.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Alimento createAlimento(@RequestBody Alimento alimento){
        return repositoryAlimento.save(alimento);
    }

    @RequestMapping(path = "/idUsuario/{idUsuario}",method = RequestMethod.GET)
    public List<Alimento> getAlimentoidUsuario(@PathVariable(value = "idUsuario") int idUsuario )
    {
        List<Alimento> list  = new ArrayList<>();
        return repositoryAlimento.getAlimentoByidUsuario(idUsuario);
    }
}
