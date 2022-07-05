/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author Saul Hernandez
 */
public interface ArticuloService {

    public List<Articulo> getArticulos(boolean activo);
    public Articulo getArticulo(Articulo articulo);
    public void save(Articulo articulo);
    public void delete(Articulo articulo);

}
