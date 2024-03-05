package com.example.Plato.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Plato.model.Plato;
import com.example.Plato.servicio.PlatoServicio;

@RestController
@RequestMapping("api/platos")
@CrossOrigin("*")
public class PlatoControlador {
    
    private final PlatoServicio servicioPlato;

    @Autowired
    public PlatoControlador(PlatoServicio servicio){
        this.servicioPlato = servicio;
    }

    @GetMapping
    public List<Plato> obtenerTodosLosPlatos() {
        return servicioPlato.obtenerTodosLosPlatos();
    }

    @GetMapping("/{id}")
    public Optional<Plato> obtenerPorId(@PathVariable Long id) {
        return servicioPlato.obtenerPorId(id);
    }

    @PostMapping
    public Plato guardarPlato(@RequestBody Plato plato) {
        return servicioPlato.guardarPlato(plato);
    }

    @DeleteMapping("/{id}")
    public void eliminarPlato(@PathVariable Long id){
        servicioPlato.eliminarPlato(id);
    }
    
    
}
