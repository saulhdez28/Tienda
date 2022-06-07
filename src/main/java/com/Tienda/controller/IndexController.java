package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("ahora utilizamos MVC");

        /*Cliente cliente = new Cliente("Saul", "Hernandez Araya", "shernandez60228@ufide.ac.cr", "2222 2222");
        Cliente cliente2 = new Cliente("Antonio", "Hernandez Araya", "ahernandez60228@ufide.ac.cr", "8888 8888");

        var clientes = Arrays.asList(cliente, cliente2);

        model.addAttribute("clientes", clientes);
        model.addAttribute("cliente", cliente);*/
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }

}
