/**
 * 
 */
package com.javamodc4.springjwt.almacenes.service;

import java.util.List;

import com.javamodc4.springjwt.almacenes.dto.Maquina;

/**
 * @author aitor
 *
 */
public interface IMaquinaService {
	// Metodos del CRUD
	public List<Maquina> listarMaquina(); // Listar All

	public Maquina guardarMaquina(Maquina maquina); // Guarda un proveedor CREATE

	public Maquina maquinaById(int id); // Leer datos de un proveedor READ

	public Maquina actualizarMaquina(Maquina maquina); // Actualiza datos del proveedor UPDATE

	public void eliminarMaquina(int id);// Elimina el proveedor DELETE
}
