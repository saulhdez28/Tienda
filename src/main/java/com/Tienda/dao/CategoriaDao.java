/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.dao;

import com.Tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Saul Hernandez
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
