package edu.upc.oss.SmartDiet.Controller;

import edu.upc.oss.SmartDiet.Entity.Usuario;
import edu.upc.oss.SmartDiet.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet/Usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> getUsuario() {
        return usuarioService.getAllUsuarios();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Usuario getPersonById(@PathVariable(value = "id") int id){
        return usuarioService.getPersonaId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario createPerson(@RequestBody Usuario person){
        return usuarioService.createUser(person);
    }

    @RequestMapping(path = "/Apellido/{Apellido}",method = RequestMethod.GET)
    public List<Usuario> getUsuarioApellido(@PathVariable(value = "Apellido") String Apellido )
    {
        return usuarioService.getUsuarioApellido(Apellido);
    }
}
