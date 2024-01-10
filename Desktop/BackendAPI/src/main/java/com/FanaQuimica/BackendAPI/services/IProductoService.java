package com.FanaQuimica.BackendAPI.services;

import com.FanaQuimica.BackendAPI.model.Cliente;
import com.FanaQuimica.BackendAPI.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    List<Producto> addProducto();

    List<Producto> getAllProductos();

    Optional<Producto> findById(Long id);

    Producto save(Producto producto);

    void deleteProducto(Long id);
}
