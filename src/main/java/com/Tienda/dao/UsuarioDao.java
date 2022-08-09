/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.dao;

import com.Tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    List<Usuario> findByIdRol(Long idRol);
}
