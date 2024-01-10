package com.FanaQuimica.BackendAPI.services;

import com.FanaQuimica.BackendAPI.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);

    Cliente save(Cliente cliente);

    void deleteCliente(Long id);
}
