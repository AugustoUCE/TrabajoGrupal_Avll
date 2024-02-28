package com.edu.ec.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
	@Column(name="cli_id")
	private Integer id;
	@Column(name="cli_cedula")
	private String cedula;
	@Column(name="cli_nombre")
	private String nombre;
	@Column(name="cli_apellido")
	private String apellido;
	@Column(name="cli_fecha_De_Nacimiento")
	private LocalDate fechaDeNacimiento;
	@Column(name="cli_genero")
	private String genero;
	@Column(name="cli_registro")
	private String registro;
	

}
