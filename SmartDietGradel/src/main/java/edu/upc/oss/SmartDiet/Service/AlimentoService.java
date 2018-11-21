package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Entity.DatoAlimento;
import edu.upc.oss.SmartDiet.Repository.AlimentoRepository;
import edu.upc.oss.SmartDiet.Repository.DatoAlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AlimentoService implements AlimentoServiceInterface {

    AlimentoRepository alimentoRepository;
    DatoAlimentoRepository datoAlimentoRepository;

    @Autowired
    public AlimentoService(AlimentoRepository alimentoRepository, DatoAlimentoRepository datoAlimentoRepository)
    {
        this.alimentoRepository = alimentoRepository;
        this.datoAlimentoRepository = datoAlimentoRepository;
    }




    @Override
    public Alimento createAlimento(Alimento alimento) {
        Optional<DatoAlimento> Dato = datoAlimentoRepository.findById(alimento.getDatoAlimento().getIddatoalimento());
        alimento.setDatoAlimento(Dato.get());
        return alimentoRepository.save(alimento);
    }

    @Override
    public void deleteAlimento(int id) {
        alimentoRepository.deleteById(id);
    }

    @Override
    public Alimento actualizarAlimento(Alimento alimento) {

        Alimento alimento1 = new Alimento();
        if(!alimentoRepository.existsById(alimento.getIdalimento())){
            alimentoRepository.save(alimento);
            alimento1 = alimento;
        }
        return alimento;

    }
    @Override
    public List<Alimento> getAlimentos() {
        List<Alimento> list = new ArrayList<>();
        alimentoRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Alimento> getAlimentosPorFecha(Date fecha) {
        List<Alimento> lista = new ArrayList<>();
        alimentoRepository.getAlimentosByFecha(fecha).iterator().forEachRemaining(lista::add);
        return lista;
    }
}