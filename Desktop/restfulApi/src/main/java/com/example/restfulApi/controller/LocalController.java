package com.example.restfulApi.controller;

import com.example.restfulApi.entity.Local;
import com.example.restfulApi.error.LocalNotFound;
import com.example.restfulApi.service.LocalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocalController {
    @Autowired
    LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local>findAllLocal(){
        return localService.findAllLocals();
    }

    @PostMapping("/saveLocal")
    public Local saveLocal(@Valid @RequestBody Local local){
        return localService.saveLocal(local);
    }


    //ACTUALIZAR
    @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id,@RequestBody Local local){
        return localService.updateLocal(id,local);
    }

    @DeleteMapping("/deleteLocal/{id}")
    public String deleteLocal(@PathVariable Long id){
        localService.deleteLocal(id);
        return "Registro borrado con exito";
    }

    @GetMapping("/findLocalByNameJPQL/{name}")
    Optional<Local>findLocalByNameJPQL(@PathVariable String name){
        return localService.findLocalByNameJPQL(name);
    }

    @GetMapping("/findByName/{name}")
    Optional<Local>findByName(@PathVariable String name){
        return localService.findByName(name);
    }

    @GetMapping("/findByNameIgnoreCase/{name}")
    Optional<Local>findByNameIgnoreCase(@PathVariable String name){
        return localService.findByNameIgnoreCase(name);
    }

    @GetMapping("/findLocalById/{id}")
    Local findLocalById(@PathVariable Long id) throws LocalNotFound {
        return localService.findLocalById(id);
    }

}
