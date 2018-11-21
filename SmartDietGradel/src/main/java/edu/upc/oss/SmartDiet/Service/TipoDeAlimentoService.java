package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.TipoDeAlimento;
import edu.upc.oss.SmartDiet.Repository.TipoDeAlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDeAlimentoService implements TipoDeAlimentoServiceInterface{

    TipoDeAlimentoRepository tipoDeAlimentoRepository;

    @Autowired
    public TipoDeAlimentoService(TipoDeAlimentoRepository tipoDeAlimentoRepository)
    {
        this.tipoDeAlimentoRepository = tipoDeAlimentoRepository;
    }

    @Override
    public TipoDeAlimento createTipoDA(TipoDeAlimento TipoDA) {
        if (!tipoDeAlimentoRepository.existsTipoDeAlimentoByNombre(TipoDA.getNombre())){
            return tipoDeAlimentoRepository.save(TipoDA);}
        else return null;
    }

    @Override
    public void deleteTipoDA(int id) {
        tipoDeAlimentoRepository.deleteById(id);
    }

    @Override
    public TipoDeAlimento actualizarTipoDeAlimento(TipoDeAlimento TipoDA) {
        TipoDeAlimento tipoDeAliment = new TipoDeAlimento();
        if(!tipoDeAlimentoRepository.existsById(TipoDA.getIdTipoDA())){
            tipoDeAlimentoRepository.save(TipoDA);
            tipoDeAliment = TipoDA;
        }
        return tipoDeAliment;
    }

    @Override
    public List<TipoDeAlimento> getAllTipoDeAlimentos() {
        List<TipoDeAlimento> list = new ArrayList<>();
        tipoDeAlimentoRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public TipoDeAlimento getTipoDeAlimentoId(int ID) {
        return tipoDeAlimentoRepository.findById(ID).get();
    }
}
