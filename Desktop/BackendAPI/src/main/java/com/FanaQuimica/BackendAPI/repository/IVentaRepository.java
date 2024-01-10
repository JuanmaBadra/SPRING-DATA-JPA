package com.FanaQuimica.BackendAPI.repository;

import com.FanaQuimica.BackendAPI.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long> {

}
