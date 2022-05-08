package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
public class clientesController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> Clientes() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente add(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
