package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentoService implements AlimentoServiceInterface {

    AlimentoRepository alimentoRepository;

    @Autowired
    public AlimentoService(AlimentoRepository alimentoRepository)
    {
        this.alimentoRepository = alimentoRepository;
    }

    @Override
    public Alimento createAlimento(Alimento alimento) {
        if (alimentoRepository.existsByNombre(alimento.getNombre())){
            return alimentoRepository.save(alimento);}
       else return null;
    }

    @Override
    public void deleteAlimento(Alimento alimento) {
    }

    @Override
    public Alimento actualizarAlimento(Alimento user) {
        return null;
    }
}