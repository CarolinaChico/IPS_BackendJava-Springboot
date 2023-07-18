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

import com.Services.EspecialidadServices;
import com.entregablebackend.entregablebackend.entity.Especialidad;

@CrossOrigin
@RestController

public class EspecialidadController {
    @Autowired
    EspecialidadServices especialidadService;
    @GetMapping("/especialidades")
     
    public ArrayList<Especialidad> obtenerEspecialidad(){
        return especialidadService.obtenerEspecialidad();
    }

      @PostMapping(path = "/crear_especialidad")
        public Especialidad guardarEspecialidad(@RequestBody Especialidad especialidad){
        return this.especialidadService.guardarEspecialidad(especialidad);
    }

    @GetMapping(path = "/{id}")
    public Optional<Especialidad> obtenerEspecialidadId(@PathVariable("id") Long id){
        return this.especialidadService.obtenerEspecialidadId(id);
    }


}