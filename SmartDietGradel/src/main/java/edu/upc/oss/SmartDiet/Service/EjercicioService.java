package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Ejercicio;
import edu.upc.oss.SmartDiet.Repository.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EjercicioService implements EjercicioServiceInterface {

    EjercicioRepository ejercicioRepository;

    @Autowired
    public EjercicioService(EjercicioRepository ejercicioRepository){this.ejercicioRepository = ejercicioRepository;}

    @Override
    public List<Ejercicio> getEjercicios() {
        List<Ejercicio> list = new ArrayList<>();
        ejercicioRepository.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @Override
    public Ejercicio crearEjercicio(Ejercicio ejercicio) {
        return ejercicioRepository.save(ejercicio);
    }

    @Override
    public Ejercicio getEjercicioById(int id) {
        return ejercicioRepository.findById(id).get();
    }

    @Override
    public void deleteEjercicio(int id) {
        ejercicioRepository.deleteById(id);
    }

    @Override
    public Ejercicio actualizarEjercicio(Ejercicio ejercicio) {
        Ejercicio ejercicio1 = new Ejercicio();
        if(!ejercicioRepository.existsById(ejercicio.getIdpdejercicio())){
            ejercicioRepository.save(ejercicio);
            ejercicio1 = ejercicio;
        }
        return ejercicio1;
    }
    @Override
    public List<Ejercicio> getEjerciciosporpuntaje(int puntaje){
        List<Ejercicio> lista = new ArrayList<>();
        ejercicioRepository.getEjercicioByPuntajeLessThanEqual(puntaje).iterator().forEachRemaining(lista::add);
        return lista;


    }
}
