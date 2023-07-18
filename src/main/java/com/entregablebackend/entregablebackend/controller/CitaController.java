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

import com.Services.CitaServices;
import com.entregablebackend.entregablebackend.entity.Cita;

@CrossOrigin
@RestController

public class CitaController {
    @Autowired
    CitaServices citaService;
    @GetMapping("/cita")
     
    public ArrayList<Cita> obtenerCita(){
        return citaService.obtenerCita();
    }

      @PostMapping(path = "/crear_cita")
        public Cita guardarCita(@RequestBody Cita medico){
        return this.citaService.guardarCita(medico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Cita> obtenerCitaId(@PathVariable("id") Long id){
        return this.citaService.obtenerCitaId(id);
    }


}

