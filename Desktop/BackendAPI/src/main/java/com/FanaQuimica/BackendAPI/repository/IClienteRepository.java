package com.FanaQuimica.BackendAPI.repository;

import com.FanaQuimica.BackendAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByNombre(String nombre);

}
