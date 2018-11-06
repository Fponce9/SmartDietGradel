package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.TipoDeAlimento;
import edu.upc.oss.SmartDiet.Service.TipoDeAlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/TipoDeAlimento")
public class TipoDeAlimentoController {

    @Autowired
    TipoDeAlimentoService tipoDeAlimentoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TipoDeAlimento> getUsuario() {
        return tipoDeAlimentoService.getAllTipoDeAlimentos();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public TipoDeAlimento getTipoDeAlimentoById(@PathVariable(value = "id") int id){
        return tipoDeAlimentoService.getTipoDeAlimentoId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public TipoDeAlimento createTipoDeAlimento(@RequestBody TipoDeAlimento tipo){
        return tipoDeAlimentoService.createTipoDA(tipo);
    }


}
