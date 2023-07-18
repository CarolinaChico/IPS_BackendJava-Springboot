package com.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregablebackend.entregablebackend.entity.Medico;
import com.entregablebackend.entregablebackend.repository.MedicoRepository;

@Service
public class MedicoServices {
    @Autowired
    MedicoRepository medicoRepository;

     public ArrayList<Medico> obtenerMedicos(){
        return (ArrayList<Medico>) medicoRepository.findAll();

     }

     public Medico guardarMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    public Optional<Medico> obtenerMedicoId(Long id){
        return medicoRepository.findById(id);
    }
}
