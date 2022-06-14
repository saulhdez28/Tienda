/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author Saul Hernandez
 */
public interface ClienteService {

    public List<Cliente> getClientes();
    public Cliente getCliente(Cliente cliente);
    public void save(Cliente cliente);
    public void delete(Cliente cliente);

}
