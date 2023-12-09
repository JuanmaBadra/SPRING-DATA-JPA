package com.example.Spring.Data.JPA.repository;

import com.example.Spring.Data.JPA.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    @Query("select c from Customer c where c.email =?1")
    Customer getCustomerByEmailAddress(String email);

    @Query("select c.firstName from Customer c where c.email =?1")
    String getCustomerFirstNameByEmailAddress(String mail);


    ///obtengo un mayor nivel de control con la BD
    @Query(
            value = "select * from tb_customer where email_address : emailAddress",
            nativeQuery = true
    )
    Customer getCustomerByEmailAddressNative(String email);

    Customer getCustomerByEmailAddressNativeNamed(@Param("emailAddress") String email);
}
