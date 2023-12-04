package com.example.restfulApi.repository;

import com.example.restfulApi.entity.Local;
import com.example.restfulApi.service.LocalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LocalRepository extends JpaRepository<Local,Long> {

    ///consulta con jpql
    @Query("SELECT l FROM Local l WHERE l.name = :name")
    Optional<Local> findLocalByNameJPQL(String name);

    ///consulta con INversion de COntrol
    Optional<Local> findByName(String name);

    Optional<Local> findByNameIgnoreCase(String name);

    Local findLocalById(Long id);
}
