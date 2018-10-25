//SpringBoot uses martial for the convertion of the objects to a Json file
package edu.upc.oss.SmartDiet.Controller;


import edu.upc.oss.SmartDiet.Entity.Usuario;
import edu.upc.oss.SmartDiet.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/SmartDiet")
public class UsuarioController {

    @Autowired
    UsuarioRepository repositoryUsuario;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> getUsuario() {

        List<Usuario> list = new ArrayList<>();
        repositoryUsuario.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    //En el postman se encuentra la opcion header, los valores que debe de tener son los siguientes>
    //Header : Content-Type
    //Value  : aplication/json

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Usuario getPersonById(@PathVariable(value = "id") int id){
        return repositoryUsuario.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario createPerson(@RequestBody Usuario person){
        return repositoryUsuario.save(person);
    }

    @RequestMapping(path = "/Apellido/{Apellido}",method = RequestMethod.GET)
    public List<Usuario> getUsuarioApellido(@PathVariable(value = "Apellido") String Apellido )
    {
        List<Usuario> list  = new ArrayList<>();
        return repositoryUsuario.getUsuariosByApellido(Apellido);
    }
}
