package com.FanaQuimica.BackendAPI.controller;

import com.FanaQuimica.BackendAPI.model.Producto;
import com.FanaQuimica.BackendAPI.model.Rubro;
import com.FanaQuimica.BackendAPI.model.Venta;
import com.FanaQuimica.BackendAPI.repository.IClienteRepository;
import com.FanaQuimica.BackendAPI.repository.IProductoRepository;
import com.FanaQuimica.BackendAPI.repository.IRubroRepository;
import com.FanaQuimica.BackendAPI.repository.IVentaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    IProductoRepository productoRepository;
    @Autowired
    IRubroRepository rubroRepository;
    @Autowired
    IClienteRepository clienteRepository;
    @Autowired
    IVentaRepository iVentaRepository;


    @PostMapping("/addProductos")
    @Transactional
    public ResponseEntity<Producto> addProducto(@Valid @RequestBody Producto producto, BindingResult result) {
        if (result.hasErrors()) {
            // Manejar errores de validación
            return ResponseEntity.badRequest().build();
        }
        Producto nuevoProducto = productoRepository.save(producto);
        return ResponseEntity.ok(nuevoProducto);
    }

    @GetMapping("/todoProductos")
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @GetMapping("/getProducto/{id}")
    public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Long id) {
        Optional<Producto> producto = productoRepository.findById(id);
        return producto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/deleteProducto/{id}")
    public String deleteProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
        return "Registro borrado";
    }

    @PostMapping("/rubros")
    public ResponseEntity<Rubro> addRubro(@Valid @RequestBody Rubro rubro, BindingResult result) {
        if (result.hasErrors()) {
            // Manejar errores de validación
            return ResponseEntity.badRequest().build();
        }
        Rubro nuevoRubro = rubroRepository.save(rubro);
        return ResponseEntity.ok(nuevoRubro);
    }

    @GetMapping("/todoRubro")
    public List<Rubro> getAllRubro() {
        return rubroRepository.findAll();
    }




}
