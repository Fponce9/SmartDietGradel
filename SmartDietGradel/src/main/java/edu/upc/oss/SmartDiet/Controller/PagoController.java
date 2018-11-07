package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Pago;
import edu.upc.oss.SmartDiet.Service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/SmartDiet/Pago")

public class PagoController {

    @Autowired
    PagoService PagoService;

    @RequestMapping(method = RequestMethod.POST)
    public Pago getPagoById(@RequestBody Pago pago){return PagoService.createPago(pago);}

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Pago getPersonById(@PathVariable(value = "id") int id){
        return PagoService.getPago(id);
    }
}
