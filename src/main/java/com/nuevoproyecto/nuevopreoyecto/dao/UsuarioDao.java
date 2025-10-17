package com.nuevoproyecto.nuevopreoyecto.dao;

import com.nuevoproyecto.nuevopreoyecto.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> geUsuarios();

    void eliminar(Long id);
}
