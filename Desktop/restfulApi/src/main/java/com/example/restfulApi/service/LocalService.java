package com.example.restfulApi.service;

import com.example.restfulApi.entity.Local;
import com.example.restfulApi.error.LocalNotFound;

import java.util.List;
import java.util.Optional;

///define metodos de la capa de servicios
public interface LocalService {

    List<Local> findAllLocals();

    Local saveLocal(Local local);
    Local updateLocal(Long id,Local local);
    void deleteLocal(Long id);

    //SOLO uno con Optional, si uso List me trae 2 o +
   Optional<Local> findLocalByNameJPQL(String name);
   Optional<Local> findByName(String name);
    Optional<Local> findByNameIgnoreCase(String name);
    Local findLocalById(Long id) throws LocalNotFound;

}
