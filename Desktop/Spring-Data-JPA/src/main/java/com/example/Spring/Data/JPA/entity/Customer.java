package com.example.Spring.Data.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

///YA DEFINIMOS EN ESTA CLASE LAS PK
@Entity ///ESTA CLASE MAPEA COMO UNA TABLA
@Data  ///GENERA GETTERS Y SETTER AUTOMATICAMENTE, Y TAMBIEN TOSTRING
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table ///configurar/personalizar como se va a mapear a la BD,
        (
                name = "tb_customer",
                ///determino que atributos van a ser unicos
                uniqueConstraints = @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email_adress"
                )
                ///DENTRO DE TABLE, DEFINI QUE NO PUEDE HABER MAS DE UN EMAIL IGUAL.
        )
public class Customer {

    @Id
    ///como se generara las PK
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1 ///forma en que se toman los valores para generar IDS en memoria. LO OPTIMIZA
    )
    @GeneratedValue ///definimos que generador vamos a usar. Customer_sequence del name en este caso
            (
                    generator = "customer_sequence",
                    strategy = GenerationType.SEQUENCE
            )
    private Long idCustomer;
    private String firstName;
    private String lastName;

    //email tiene que existir por defecto, no puede ser NULL
    @Column(
            name = "email_adress",
            nullable = false ///si es TRUE, puede ser NULL.
    )
    private String email;

   @Embedded
    private Adress address;

   ///CONSULTAR MI CUSTOMER

}
