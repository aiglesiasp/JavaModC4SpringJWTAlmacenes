/**
 * 
 */
package com.javamodc4.springjwt.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.almacenes.dto.Maquina;

/**
 * @author aitor
 *
 */
public interface IMaquinaDAO extends JpaRepository<Maquina, Integer> {

}
