package com.nuevoproyecto.nuevopreoyecto.dao;

import com.nuevoproyecto.nuevopreoyecto.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jdk.jfr.TransitionFrom;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository  // va  atener la posibilidad de acceder al repositorio del proyecto
@Transactional // hace referencia a como va a tratar las consultas de la base de datos

public class UsuarioDaoImp implements UsuarioDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Usuario> geUsuarios() {
        String query ="FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }
}
