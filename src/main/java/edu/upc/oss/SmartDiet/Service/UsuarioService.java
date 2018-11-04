package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Usuario;
import edu.upc.oss.SmartDiet.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        usuarioRepository.delete(user);
    }

    @Override
    public Usuario actualizarUsuario(Usuario user) {
        Usuario usuario = new Usuario();
        if(usuarioRepository.existsById(user.getIdusuario())){
            usuarioRepository.save(user);
            usuario = user;
        }
        return usuario;
    }

    @Override
    public List<Usuario> getUsuarioApellido(String Apellido) {
        return usuarioRepository.getUsuariosByApellido(Apellido);
    }

    @Override
    public Usuario getPersonaId(int ID) {
        return usuarioRepository.findById(ID).get();
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        List<Usuario> list = new ArrayList<>();
        usuarioRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

}
