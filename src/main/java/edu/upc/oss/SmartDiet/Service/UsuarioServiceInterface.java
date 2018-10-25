package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Usuario;

public interface UsuarioServiceInterface {
    Usuario createUser (Usuario user);
    void deleteUser(Usuario user);
    Usuario actualizarUsuario(Usuario user);
}
