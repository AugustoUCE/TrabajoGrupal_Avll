package com.edu.ec.service;

import java.util.List;

import com.edu.ec.repository.modelo.Vehiculo;

public interface IVehiculoService {
	// CRUD
	public Vehiculo buscar(Integer id);

	public void guardar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(Integer id);
	//funcionalidades
	public List<Vehiculo> buscarMarcarModelo(String marca,String modelo);
}
