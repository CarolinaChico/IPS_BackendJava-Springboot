package com.entregablebackend.entregablebackend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Services.PacienteServices;
import com.entregablebackend.entregablebackend.entity.Paciente;

@CrossOrigin
@RestController

public class PacienteController {
    @Autowired
    PacienteServices pacienteService;
    @GetMapping("/pacientes")
     
    public ArrayList<Paciente> obtenerPacientes(){
        return pacienteService.obtenerPacientes();
    }

      @PostMapping(path = "/crear_paciente")
    public Paciente guardarPaciente(@RequestBody Paciente paciente){
        return this.pacienteService.guardarPaciente(paciente);
    }

    @GetMapping(path = "/{id}")
    public Optional<Paciente> obtenerPacienteId(@PathVariable("id") Long id){
        return this.pacienteService.obtenerPacienteId(id);
    }


}
