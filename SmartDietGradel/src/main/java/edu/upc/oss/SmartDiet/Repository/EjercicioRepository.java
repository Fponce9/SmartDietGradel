
package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.Ejercicio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EjercicioRepository extends CrudRepository<Ejercicio,Integer> {
 List<Ejercicio> getEjercicioByPuntajeLessThanEqual(int puntaje);

}
