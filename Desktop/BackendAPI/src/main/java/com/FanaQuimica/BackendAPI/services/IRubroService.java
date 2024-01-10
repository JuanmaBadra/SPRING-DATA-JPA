package com.FanaQuimica.BackendAPI.services;

import com.FanaQuimica.BackendAPI.model.Cliente;
import com.FanaQuimica.BackendAPI.model.Rubro;

import java.util.List;
import java.util.Optional;

public interface IRubroService {
    List<Rubro> findAll();
    Optional<Rubro> findById(Long id);

    Rubro save(Rubro rubro);

    void deleteRubro(Long id);
}
