/**
 * 
 */
package com.javamodc4.springjwt.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.almacenes.dao.IVentaDAO;
import com.javamodc4.springjwt.almacenes.dto.Venta;

/**
 * @author aitor
 *
 */
@Service
public class VentaServiceImpl implements IVentaService {
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaById(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);

	}

}
