package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.DatoAlimento;
import edu.upc.oss.SmartDiet.Repository.DatoAlimentoRepository;
import edu.upc.oss.SmartDiet.Service.AlimentoService;
import edu.upc.oss.SmartDiet.Service.DatoAlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/DatoAlimento")
public class DatoAlimentoController {

    @Autowired
    DatoAlimentoService datoAlimentoService;



    @RequestMapping(method = RequestMethod.GET)
    public List<DatoAlimento> getDatoAlimento() {

        return datoAlimentoService.getDatoAlimentos();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public DatoAlimento getDatoAlimentoById(@PathVariable(value = "id") int id){
        return datoAlimentoService.getDatoAlimentobyId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public DatoAlimento createDatoAlimento(@RequestBody DatoAlimento datoAlimento){
        return datoAlimentoService.createDatoAlimento(datoAlimento);
    }

    @RequestMapping(path = "/{id}" ,method = RequestMethod.DELETE)
    public void deleteDatoAlimento(@PathVariable(value = "id") int id){
        datoAlimentoService.deleteDatoAlimento(id);
    }
}
