package edu.upc.oss.SmartDiet.Repository;

import edu.upc.oss.SmartDiet.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

    List<Usuario> getUsuariosByApellido(String Apellido);
}
