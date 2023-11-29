package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity ///le dice que sera una entidad, asegurada!
@Data ///flujo de informacion, llena los campos mas sencillo
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHuesped;

    private String name;
    private String lastname;
    private String dateBorn;
    private String country;

    @OneToMany(cascade=CascadeType.ALL)
    // uno a muchos( Un huesped muchas reservas)
    private List<Reserva> reservas = new ArrayList<>();


}
