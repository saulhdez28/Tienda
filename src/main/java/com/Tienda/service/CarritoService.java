/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Carrito;

/**
 *
 * @author Saul Hernandez
 */
public interface CarritoService {

    public Carrito getCarrito(Carrito carrito);

    public Carrito getCarritoCliente(long idCliente);
}
