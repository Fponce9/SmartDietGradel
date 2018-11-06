package edu.upc.oss.SmartDiet.Repository;


import edu.upc.oss.SmartDiet.Entity.TipoDeAlimento;
import org.springframework.data.repository.CrudRepository;

public interface TipoDeAlimentoRepository extends CrudRepository<TipoDeAlimento,Integer> {

    boolean existsTipoDeAlimentoByNombre(String nombre);
}
