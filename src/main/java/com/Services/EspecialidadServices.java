package com.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregablebackend.entregablebackend.entity.Especialidad;
import com.entregablebackend.entregablebackend.repository.EspecialidadRepository;

@Service
public class EspecialidadServices {
    @Autowired
    EspecialidadRepository especialidadRepository;

     public ArrayList<Especialidad> obtenerEspecialidad(){
        return (ArrayList<Especialidad>) especialidadRepository.findAll();

     }

     public Especialidad guardarEspecialidad(Especialidad especialidad){
        return especialidadRepository.save(especialidad);
    }

    public Optional<Especialidad> obtenerMedicoId(Long id){
        return especialidadRepository.findById(id);
    }

    public Optional<Especialidad> obtenerEspecialidadId(Long id) {
        return null;
    }
}
