/**
 * 
 */
package com.javamodc4.springjwt.almacenes.service;

import java.util.List;

import com.javamodc4.springjwt.almacenes.dto.Cajero;

/**
 * @author aitor
 *
 */
public interface ICajeroService {
	// Metodos del CRUD
	public List<Cajero> listarCajero(); // Listar All

	public Cajero guardarCajero(Cajero cajero); // Guarda un departamento CREATE

	public Cajero cajeroById(int codigo); // Leer datos de un departamento READ

	public Cajero actualizarCajero(Cajero cajero); // Actualiza datos del departamento UPDATE

	public void eliminarCajero(int codigo);// Elimina el departamento DELETE
}
