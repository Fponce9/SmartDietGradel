package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Pago;
import edu.upc.oss.SmartDiet.Service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/SmartDiet/Pago")

public class PagoController {

    @Autowired
    PagoService pagoService;

    @RequestMapping(method = RequestMethod.POST)
    public Pago getPagoById(@RequestBody Pago pago){return pagoService.createPago(pago);}



    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public void updatePago(@PathVariable int id, @RequestBody Pago pago){
        pago.setCCV(id);
        pagoService.actualizarPago(pago);
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void deletePago(@PathVariable int id){
        pagoService.deletePago(id);
    }
}
