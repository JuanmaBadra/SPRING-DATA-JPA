package com.example.Spring.Data.JPA.repository;

import com.example.Spring.Data.JPA.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //genera una sentencia sql retornando el registro que queremos entre los parametros
    Optional<Customer> findByFirstName(String firstName);
    ///consulta que filtre por su primer nombre
   List<Customer> findByFirstNameContaining(String firstName);
    List<Customer> findByLastNameNotNull();
    List<Customer> findByAddress_City(String city);


}
