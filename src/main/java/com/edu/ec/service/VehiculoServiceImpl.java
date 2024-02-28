package com.edu.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ec.repository.IVehiculoRepository;
import com.edu.ec.repository.modelo.Vehiculo;

import jakarta.transaction.Transactional;import jakarta.transaction.Transactional.TxType;


@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	@Transactional(value = TxType.SUPPORTS)
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		 this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		 this.vehiculoRepository.actualizar(vehiculo);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		 this.vehiculoRepository.eliminar(id);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Vehiculo> buscarMarcarModelo(String marca,String modelo) {
		// TODO Auto-generated method stub
		return  this.vehiculoRepository.seleccionarMarcarModelo(marca, modelo);
	}



}
