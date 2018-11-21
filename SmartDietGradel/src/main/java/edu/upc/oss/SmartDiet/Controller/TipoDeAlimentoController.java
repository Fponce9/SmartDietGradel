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

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public void updateTipoDA(@PathVariable int id, @RequestBody TipoDeAlimento tipo){
        tipo.setIdTipoDA(id);
        tipoDeAlimentoService.actualizarTipoDeAlimento(tipo);
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void deleteTipoDA(@PathVariable int id){
        tipoDeAlimentoService.deleteTipoDA(id);
    }


}
