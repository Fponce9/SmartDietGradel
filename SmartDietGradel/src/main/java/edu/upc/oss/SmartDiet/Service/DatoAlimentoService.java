package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.DatoAlimento;
import edu.upc.oss.SmartDiet.Repository.DatoAlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatoAlimentoService implements DatoAlimentoServiceInterface {

    DatoAlimentoRepository datoAlimentoRepository;

    @Autowired
    public DatoAlimentoService(DatoAlimentoRepository datoAlimentoRepository)
    {
        this.datoAlimentoRepository = datoAlimentoRepository;
    }

    @Override
    public DatoAlimento createDatoAlimento(DatoAlimento alimento) {
        if (!datoAlimentoRepository.existsByNombre(alimento.getNombre())){
            return datoAlimentoRepository.save(alimento);}
       else return null;
    }

    @Override
    public void deleteDatoAlimento(int id) {
        datoAlimentoRepository.deleteById(id);
    }



    @Override
    public DatoAlimento getDatoAlimentobyId(int id) {
        return datoAlimentoRepository.findById(id).get();
    }


    @Override
    public List<DatoAlimento> getDatoAlimentos() {
        List<DatoAlimento> list = new ArrayList<>();
        datoAlimentoRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}