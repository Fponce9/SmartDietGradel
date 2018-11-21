package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Pago;
import edu.upc.oss.SmartDiet.Entity.Usuario;
import edu.upc.oss.SmartDiet.Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService implements PagoServiceInterface {

    PagoRepository pagoRepository;

    @Autowired
    public PagoService(PagoRepository pagoRepository){this.pagoRepository = pagoRepository;}

    @Override
    public Pago createPago(Pago pago) {
        if (!pagoRepository.existsPagoByNumTarjeta(pago.getNumTarjeta())){
            return pagoRepository.save(pago);
        }
        return null;
    }

    @Override
    public void deletePago(int id) {
        pagoRepository.deleteById(id);
    }

    @Override
    public Pago actualizarPago(Pago pago) {

        Pago pago1 = new Pago();
        if(!pagoRepository.existsById(pago.getCCV())){
            pagoRepository.save(pago);
            pago1 = pago;
        }
        return pago1;


    }



}
