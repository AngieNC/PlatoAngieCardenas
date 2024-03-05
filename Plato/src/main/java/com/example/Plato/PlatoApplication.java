package com.example.Plato;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Plato.model.Plato;
import com.example.Plato.servicio.PlatoServicioImpl;

@SpringBootApplication
public class PlatoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext contexto = SpringApplication.run(PlatoApplication.class, args);

		PlatoServicioImpl platoServicio = contexto.getBean(PlatoServicioImpl.class);

		Plato platillo = new Plato();

		// GUARDAR
		System.out.println("--------------------------------------------------");
		System.out.println("SISTEMA DE PLATOS");
		System.out.println("--------------------------------------------------");
		System.out.println("Guardando un plato..");
		platillo.setNombre("Ordinario");
		platillo.setDescripcion("Hecho en casa de la abuela");
		platillo.setPrecio(245.1);
		platillo.setFechaElaboracion(new Date());
		platoServicio.guardarPlato(platillo);
		System.out.println("El plato " + platillo + " ha sido guardado");
		System.out.println("--------------------------------------------------");

		System.out.println("Guardando un plato..");
		platillo.setNombre("Carne");
		platillo.setDescripcion("Desde las alturas hasta tu casa");
		platillo.setPrecio(287.6);
		platillo.setFechaElaboracion(new Date());
		platoServicio.guardarPlato(platillo);
		System.out.println("El plato " + platillo + " ha sido guardado");
		System.out.println("--------------------------------------------------");

		System.out.println("Guardando un plato..");
		platillo.setNombre("Pollo");
		platillo.setDescripcion("Con salsa boloñesa");
		platillo.setPrecio(785.6);
		platillo.setFechaElaboracion(new Date());
		platoServicio.guardarPlato(platillo);
		System.out.println("El plato " + platillo + " ha sido guardado");
		System.out.println("--------------------------------------------------");
		
		// ELIMINAR
		// System.out.println("--------------------------------------------------");
		// System.out.println("Eliminando el plato por id");
		// platoServicio.eliminarPlato(Long.valueOf(2));
		// System.out.println("Plato eliminado");
		// System.out.println("--------------------------------------------------");

		// MOSTRAR TODOS	
		// System.out.println("--------------------------------------------------");
		// System.out.println("Hay diferentes platos como: ");
		// List<Plato> mostrarTodos = platoServicio.obtenerTodosLosPlatos();
		// mostrarTodos.forEach(System.out::println);

		// MOSTRAR POR ID
		// System.out.println("--------------------------------------------------");
		// System.out.println("Mostrar plato con un id: ");
		// platoServicio.obtenerPorId(Long.valueOf(3)).ifPresent(System.out::println);

		// ACTUALIZAR
		// System.out.println("--------------------------------------------------");
		// System.out.println("Actualizacion de un plato");
		// platoServicio.actualizar(Long.valueOf(3), "Pollo", "Pollo a la carbonara", 542.1, new Date());
		// System.out.println("Actualizado :)");
		
	}

}
