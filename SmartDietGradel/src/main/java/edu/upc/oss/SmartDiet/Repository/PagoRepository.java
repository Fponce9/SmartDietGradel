package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface PagoRepository extends CrudRepository<Pago,Integer> {
    boolean existsPagoByNumTarjeta(int numTarjeta);
    Pago getPagoByIdUsuario(int IdUsuario);
}
