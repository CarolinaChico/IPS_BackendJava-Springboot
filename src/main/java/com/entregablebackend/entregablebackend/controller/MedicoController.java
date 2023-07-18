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

import com.Services.MedicoServices;
import com.entregablebackend.entregablebackend.entity.Medico;

@CrossOrigin
@RestController

public class MedicoController {
    @Autowired
    MedicoServices medicoService;
    @GetMapping("/medicos")
     
    public ArrayList<Medico> obtenerMedico(){
        return medicoService.obtenerMedicos();
    }

      @PostMapping(path = "/crear_medico")
        public Medico guardarMedico(@RequestBody Medico medico){
        return this.medicoService.guardarMedico(medico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Medico> obtenerMedicoId(@PathVariable("id") Long id){
        return this.medicoService.obtenerMedicoId(id);
    }


}
