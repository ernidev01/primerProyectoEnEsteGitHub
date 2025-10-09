package com.nuevoproyecto.nuevopreoyecto.controllers;

import com.nuevoproyecto.nuevopreoyecto.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}") // para que cuando busque el id sea automático
    public Usuario getUsuario(@PathVariable long id){ // la anotacion @PathVariable es para
        Usuario usuario = new Usuario();
       usuario.setId(id);
       usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
    @RequestMapping(value = "usuario") // para que cuando busque el id sea automático
    public List<Usuario> getUsuario(@PathVariable long id){ // la anotacion @PathVariable es para
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
    @RequestMapping(value = "usuario132")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
    @RequestMapping(value = "usuario123")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
    @RequestMapping(value = "usuario231")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Erick");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("correo@gmail.com");
        usuario.setTelefono("12341545");
        usuario.setPassword("kdsfds");

        return usuario;
    }
}
