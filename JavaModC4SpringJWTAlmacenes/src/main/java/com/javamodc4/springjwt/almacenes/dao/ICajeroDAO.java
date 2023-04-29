/**
 * 
 */
package com.javamodc4.springjwt.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.almacenes.dto.Cajero;

/**
 * @author aitor
 *
 */
public interface ICajeroDAO extends JpaRepository<Cajero, Integer> {

}
