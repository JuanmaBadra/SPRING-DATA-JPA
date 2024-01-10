package com.FanaQuimica.BackendAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(length = 70, nullable = false)
    private String nombre;


    @Column(unique = true)
    private String dni;

    public Cliente() {
    }

}
