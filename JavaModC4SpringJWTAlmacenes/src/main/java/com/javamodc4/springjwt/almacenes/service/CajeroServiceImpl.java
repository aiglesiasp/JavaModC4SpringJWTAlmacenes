/**
 * 
 */
package com.javamodc4.springjwt.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.almacenes.dao.ICajeroDAO;
import com.javamodc4.springjwt.almacenes.dto.Cajero;

/**
 * @author aitor
 *
 */
@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajero() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroById(int codigo) {
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int codigo) {
		iCajeroDAO.deleteById(codigo);

	}

}
