package com.edu.ec.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.ec.repository.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Vehiculo seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

		this.entityManager.remove(this.seleccionar(id));
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Vehiculo> seleccionarMarcarModelo(String marca,String modelo) {
		// TODO Auto-generated method stub
		String jpql="SELECT v FROM Vehiculo v WHERE v.marca=:marca AND v.modelo=:modelo";
		TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery(jpql,Vehiculo.class);
		myQuery.setParameter("marca", marca);
		myQuery.setParameter("modelo", modelo);
		
		return myQuery.getResultList();
	}

}
