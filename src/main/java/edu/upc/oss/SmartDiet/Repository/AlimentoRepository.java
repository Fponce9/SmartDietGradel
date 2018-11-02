package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlimentoRepository extends CrudRepository<Alimento,Integer> {

    List<Alimento> getAlimentoByidUsuario(int idUsuario);
   boolean existsByNombre(String nombre);

}

