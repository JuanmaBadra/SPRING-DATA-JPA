package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.model.Reserva;
import com.example.hotel.repository.HuespedRepository;
import com.example.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    ///inyecta huespedRespository
    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar huesped.
    public List<Reserva> getAllReserva(){
        return reservaRepository.findAll();
    }

    //Crear huesped.

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    // Editar huesped.
    public Reserva updateReserva(Reserva reserva){
        return  reservaRepository.save(reserva);
    }

    //eliminar huesped.
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}
