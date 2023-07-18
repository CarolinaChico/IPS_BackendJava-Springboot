package com.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregablebackend.entregablebackend.entity.Cita;
import com.entregablebackend.entregablebackend.repository.CitaRepository;

@Service
public class CitaServices {
    @Autowired
    CitaRepository citaRepository;

     public ArrayList<Cita> obtenerCita(){
        return (ArrayList<Cita>) citaRepository.findAll();

     }

     public Cita guardarCita(Cita cita){
        return citaRepository.save(cita);
    }

    public Optional<Cita> obtenerCitaId(Long id){
        return citaRepository.findById(id);
    }
}
