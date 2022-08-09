/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.dao;

import com.Tienda.domain.Articulo;
import com.Tienda.domain.CarritoDetalle;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Saul Hernandez
 */
public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long> {

    public Optional<CarritoDetalle> findByIdCarritoAndArticulo(Long idCarrito, Articulo articulo);

    public List<CarritoDetalle> findByIdCarrito(Long idCarrito);

    public void deleteByIdCarrito(Long idCarrito);
}
