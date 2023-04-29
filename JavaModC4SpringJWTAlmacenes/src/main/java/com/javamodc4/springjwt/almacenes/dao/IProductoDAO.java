/**
 * 
 */
package com.javamodc4.springjwt.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.almacenes.dto.Producto;

/**
 * @author aitor
 *
 */
public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}
