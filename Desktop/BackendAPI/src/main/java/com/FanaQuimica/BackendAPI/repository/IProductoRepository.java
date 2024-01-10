package com.FanaQuimica.BackendAPI.repository;

import com.FanaQuimica.BackendAPI.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
        @Query("SELECT p FROM Producto p WHERE p = :producto")
        Producto addProducto(@Param("producto") Producto producto);

        List<Producto> findAll();
        Optional<Producto> findById(Long idProducto);
}