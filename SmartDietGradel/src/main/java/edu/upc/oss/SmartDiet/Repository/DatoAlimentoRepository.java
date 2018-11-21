package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.DatoAlimento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DatoAlimentoRepository extends CrudRepository<DatoAlimento,Integer> {
    boolean existsByNombre(String nombre);

}

