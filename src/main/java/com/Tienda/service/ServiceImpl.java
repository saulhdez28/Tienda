/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.dao.CreditoDao;
import com.Tienda.domain.Cliente;
import com.Tienda.domain.Credito;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Saul Hernandez
 */
@Service
public class ServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Autowired
    private CreditoDao creditoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}
