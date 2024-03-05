package com.example.Plato.servicio;

import com.example.Plato.model.Plato;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface PlatoServicio {

    List<Plato> obtenerTodosLosPlatos();
    Optional<Plato> obtenerPorId(Long id);
    Plato guardarPlato (Plato plato);
    void eliminarPlato(Long id);
    void actualizar(Long id, String nombre, String descripcion, Double precio, Date fecha_elaboracion);

}
