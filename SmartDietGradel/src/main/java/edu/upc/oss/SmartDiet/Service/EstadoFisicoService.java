package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.EstadoFisico;
import edu.upc.oss.SmartDiet.Entity.TipoDeAlimento;
import edu.upc.oss.SmartDiet.Repository.EstadoFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoFisicoService implements  EstadoFisicoServiceInterface {

    EstadoFisicoRepository estadoFisicoRepository;
    @Autowired
    public EstadoFisicoService(EstadoFisicoRepository estadoFisicoRepository)
    {
        this.estadoFisicoRepository = estadoFisicoRepository;
    }

    @Override
    public EstadoFisico createEstadoFisico(EstadoFisico EstadoF) {

            return estadoFisicoRepository.save(EstadoF);

    }

    @Override
    public void deleteEstadoFisico(int id) {
        estadoFisicoRepository.deleteById(id);
    }

    @Override
    public EstadoFisico actualizarEstadoFisico(EstadoFisico EstadoF) {
        EstadoFisico estadoFisico = new EstadoFisico();
        if(!estadoFisicoRepository.existsById(EstadoF.getIdEFisico())){
            estadoFisicoRepository.save(EstadoF);
            estadoFisico = EstadoF;
        }
        return estadoFisico;
    }

    @Override
    public List<EstadoFisico> getAllEstadoFisicos() {
        List<EstadoFisico> list = new ArrayList<>();
        estadoFisicoRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public EstadoFisico getEstadoFisicoId(int ID) {
        return estadoFisicoRepository.findById(ID).get();
    }
}
