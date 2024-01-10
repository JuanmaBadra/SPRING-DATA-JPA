package com.FanaQuimica.BackendAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rubros")
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idRubro;

    @OneToMany
    @JoinTable(name = "venta_producto",
            joinColumns = @JoinColumn(name = "id_rubro"),
            inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<Producto> productos;

    // Constructor sin argumentos para JPA
    public Rubro() {
    }

    // Constructor con argumentos
    public Rubro(Long idRubro, List<Producto> productos) {
        this.idRubro = idRubro;
        this.productos = productos;
    }
}