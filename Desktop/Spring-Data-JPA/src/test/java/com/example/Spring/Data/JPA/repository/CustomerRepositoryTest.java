package com.example.Spring.Data.JPA.repository;

import com.example.Spring.Data.JPA.entity.Adress;
import com.example.Spring.Data.JPA.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired ///signfica que quiero tu repositorio de customerRepository,
    CustomerRepository customerRepository;

    @Test
    public void saveCustomer(){
        Customer customer = Customer.builder()
                .firstName("Carlos")
                .lastName("")
                .email("carloss@gmail.com")
                .build();
        ///guarda el customer
        customerRepository.save(customer);
    }

    @Test
    public void saveCustomerWithAdressEmbeded(){

        Adress adress = Adress.builder()
                .city("santa fe")
                .mainStreet("Yrigoyen")
                .secondaryStreet("peguen")
                .build();

        Customer customer = Customer.builder()
                .firstName("Carlos")
                .lastName("Garcia")
                .email("")
                .address(adress)
                .build();
        ///guarda el customer
        customerRepository.save(customer);
    }

    //CONVENCION CON NOMENCLATURA
    @Test
    public void findCustomerByFirstName(){
        Customer customer = customerRepository.findByFirstName("Alejandra").get();
        System.out.println("customer = " + customer);
    }

    @Test
    public void findByCustomers(){
        List<Customer> customerList = customerRepository.findAll();
        System.out.println("customerList = " + customerList);
    }

    @Test
    public void findAllCustomersFirstNameContaining(){
        List<Customer> customersList = customerRepository.findByFirstNameContaining("C");
        System.out.println("customersList = " + customersList);
    }

    //TRAE REGISTROS QUE NO SEAN NULOS
    @Test
    public void findAllCustomersLastNameNotNull(){
        List<Customer> customersList = customerRepository.findByLastNameNotNull();
        System.out.println("customersList = " + customersList);
    }

   @Test
    public void findAllCustomersByAddressCity(){
        List<Customer> customerList = customerRepository.findByAddress_City("Mar del Plata");
        System.out.println("customerList = " + customerList);
    }

}