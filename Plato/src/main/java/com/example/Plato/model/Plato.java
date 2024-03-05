package com.example.Plato.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Plato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlato;

    private String nombre;
    private String descripcion;
    private double precio;

    @Temporal(TemporalType.DATE)
    private Date fecha_elaboracion;

    
    public Plato() {

    }

    
    public Plato(Long idPlato, String nombre, String descripcion, double precio,
            Date fecha_elaboracion) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha_elaboracion = fecha_elaboracion;
    }


    public Long getIdPlato() {
        return idPlato;
    }


    public void setIdPlato(Long idPlato) {
        this.idPlato = idPlato;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Date getFechaElaboracion() {
        return fecha_elaboracion;
    }


    public void setFechaElaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }


    @Override
    public String toString() {
        return "Plato: "+
                "\n idPlato: " + idPlato + 
                "\n nombre: " + nombre + 
                "\n descripcion: " + descripcion + 
                "\n precio: " + precio  + 
                "\n fechaElaboracion: " + fecha_elaboracion;
    }

}
