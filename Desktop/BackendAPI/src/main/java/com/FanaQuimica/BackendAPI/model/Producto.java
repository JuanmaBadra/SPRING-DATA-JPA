package com.FanaQuimica.BackendAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idProducto")
    private Long idProducto;

    @Column(unique = true)
    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("descripcion")
    private String descripcion;
    @Column(name = "cantidad_disponible")
    @JsonProperty("cantidadDisponible")
    private double cantidadDisponible;
    @Column(name = "precio")
    @JsonProperty("precio")
    private double precio;
    @ManyToMany(mappedBy = "listaProductos")
    @JsonIgnoreProperties("listaProductos")
    private List<Venta> listaVentas;

    @ManyToOne
    @JoinColumn(name = "fk_rubro")
    @JsonIgnoreProperties("productos")
    private Rubro unRubro;

    @ManyToOne
    @JoinColumn(name = "fk_venta")
    @JsonIgnoreProperties("unCliente")
    private Venta venta;

    public Producto() {
    }
}