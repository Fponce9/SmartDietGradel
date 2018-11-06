package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServiceInterface {
    Usuario createUser (Usuario user);
    void deleteUser(int id);
    Optional<Usuario> actualizarUsuario(Usuario user);
    List<Usuario> getUsuarioApellido(String Apellido);
    Usuario getPersonaId(int ID);
    List<Usuario> getAllUsuarios();
}
