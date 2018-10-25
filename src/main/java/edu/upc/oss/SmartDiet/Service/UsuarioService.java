package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Usuario;
import edu.upc.oss.SmartDiet.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioServiceInterface {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository)
    {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario createUser(Usuario user) {
        if (usuarioRepository.existsUsuarioByUsuario(user.getUsuario())){
        return usuarioRepository.save(user);}
        else return null;
    }

    @Override
    public void deleteUser(Usuario user) {
    }

    @Override
    public Usuario actualizarUsuario(Usuario user) {
        return null;
    }
}
