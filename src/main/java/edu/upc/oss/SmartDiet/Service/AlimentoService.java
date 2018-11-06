package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        if (!alimentoRepository.existsByNombre(alimento.getNombre())){
            return alimentoRepository.save(alimento);}
       else return null;
    }

    @Override
    public void deleteAlimento(int id) {
        alimentoRepository.deleteById(id);
    }

    @Override
    public Alimento actualizarAlimento(Alimento user) {
        return null;
    }

    @Override
    public Alimento getAlimentobyId(int id) {
        return alimentoRepository.findById(id).get();
    }

    @Override
    public List<Alimento> getByIdAlimento(int id) {
        return alimentoRepository.getAlimentoByidUsuario(id);
    }

    @Override
    public List<Alimento> getAlimentos() {
        List<Alimento> list = new ArrayList<>();
        alimentoRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}