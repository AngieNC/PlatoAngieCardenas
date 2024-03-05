package com.example.Plato.servicio;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Plato.model.Plato;
import com.example.Plato.repositorio.PlatoRepositorio;

@Service
public class PlatoServicioImpl implements PlatoServicio {

    private final PlatoRepositorio repo;

    @Autowired
    public PlatoServicioImpl(PlatoRepositorio repositorio){
        this.repo = repositorio;
    }

    @Override
    public List<Plato> obtenerTodosLosPlatos() {
        return repo.findAll();
    }

    @Override
    public Optional<Plato> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Plato guardarPlato(Plato plato) {
        return repo.save(plato);
    }

    @Override
    public void eliminarPlato(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void actualizar(Long id, String nombre, String descripcion, Double precio, Date fecha_elaboracion) {
        Optional<Plato> plato = repo.findById(id);

        plato.ifPresent(x -> {
            x.setNombre(nombre);
            x.setDescripcion(descripcion);
            x.setPrecio(precio);
            x.setFechaElaboracion(fecha_elaboracion);
            repo.save(x);
        });
    }
    
    
}
