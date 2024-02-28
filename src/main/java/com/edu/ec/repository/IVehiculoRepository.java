package com.edu.ec.repository;

import java.util.List;

import com.edu.ec.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	// CRUD
	public Vehiculo seleccionar(Integer id);

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(Integer id);
	//funcionalidades
	public List<Vehiculo> seleccionarMarcarModelo(String marca,String modelo);

}
