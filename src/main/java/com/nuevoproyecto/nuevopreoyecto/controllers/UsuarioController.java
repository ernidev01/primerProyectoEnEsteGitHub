package com.nuevoproyecto.nuevopreoyecto.controllers;

import com.nuevoproyecto.nuevopreoyecto.dao.UsuarioDao;
import com.nuevoproyecto.nuevopreoyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired // esta anotación hace que la clase Usuario crea un objeto y la guarda en la variable
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    // para que cuando busque el id sea automático
    public Usuario getUsuario(@PathVariable long id) { // la anotacion @PathVariable es para
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET) // para que cuando busque el id sea automático
    public List<Usuario> getUsuarios() { // la anotacion @PathVariable es para
        return usuarioDao.geUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST) // para que cuando busque el id sea automático
    public void registrarUsuarios(@RequestBody Usuario usuario) { // la anotacion @PathVariable es para
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuario132")
    public Usuario editarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    // para que cuando busque el id sea automático
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuario231")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
}
