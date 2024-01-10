package com.FanaQuimica.BackendAPI.services;

import com.FanaQuimica.BackendAPI.model.Rubro;
import com.FanaQuimica.BackendAPI.repository.IRubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RubroServiceImpl implements IRubroService {

    @Autowired
    IRubroRepository rubroRepository;

    @Override
    public List<Rubro> findAll() {
        return rubroRepository.findAll();
    }

    @Override
    public Optional<Rubro> findById(Long id) {
        return rubroRepository.findById(id);
    }

    @Override
    public Rubro save(Rubro rubro) {
        return rubroRepository.save(rubro);
    }

    @Override
    public void deleteRubro(Long id) {
        rubroRepository.deleteById(id);
    }
}
