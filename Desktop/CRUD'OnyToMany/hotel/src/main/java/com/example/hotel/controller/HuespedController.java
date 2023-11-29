package com.example.hotel.controller;

import com.example.hotel.model.Huesped;
import com.example.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.management.LockInfo;
import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    //GET
    @GetMapping
    public List<Huesped> listAll(){
        return huespedService.getAllHuesped();
    }

    //POST
    @PostMapping
    public Huesped create(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    //PUT
    @PutMapping("editar/{id}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}
