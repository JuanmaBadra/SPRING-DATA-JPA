package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    ///inyecta huespedRespository
    @Autowired
    private HuespedRepository huespedRepository;

    //Mostrar huesped.
    public List<Huesped> getAllHuesped(){
        return huespedRepository.findAll();
    }

    //Crear huesped.

    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    // Editar huesped.
    public Huesped updateHuesped(Huesped huesped){
        return  huespedRepository.save(huesped);
    }

    //eliminar huesped.
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}
