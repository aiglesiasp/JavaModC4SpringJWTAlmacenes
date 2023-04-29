package com.javamodc4.springjwt.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.almacenes.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
