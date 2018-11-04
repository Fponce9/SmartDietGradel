package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Usuario;

import java.util.List;

public interface UsuarioServiceInterface {
    Usuario createUser (Usuario user);
    void deleteUser(Usuario user);
    Usuario actualizarUsuario(Usuario user);
    List<Usuario> getUsuarioApellido(String Apellido);
    Usuario getPersonaId(int ID);
    List<Usuario> getAllUsuarios();
}
