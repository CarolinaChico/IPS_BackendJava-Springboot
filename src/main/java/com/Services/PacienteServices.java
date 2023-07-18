package com.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregablebackend.entregablebackend.entity.Paciente;
import com.entregablebackend.entregablebackend.repository.PacienteRepository;

@Service
public class PacienteServices {
    @Autowired
    PacienteRepository pacienteRepository;

     public ArrayList<Paciente> obtenerPacientes(){
        return (ArrayList<Paciente>) pacienteRepository.findAll();

     }

     public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> obtenerPacienteId(Long id){
        return pacienteRepository.findById(id);
    }
}
