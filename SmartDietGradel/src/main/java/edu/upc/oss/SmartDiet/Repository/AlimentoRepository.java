package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface AlimentoRepository extends CrudRepository<Alimento,Integer> {
    List<Alimento> getAlimentosByFecha(Date fecha);
}

