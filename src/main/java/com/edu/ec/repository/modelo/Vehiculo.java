package com.edu.ec.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehiculo")
	@SequenceGenerator(name = "seq_vehiculo", sequenceName = "seq_vehiculo", allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_modelo")
	private String modelo;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_anio_De_Fabricacion")
	private LocalDate anioDeFabricacion;
	@Column(name = "vehi_pais_De_Fabricacion")
	private String paisDeFabricacion;
	@Column(name = "vehi_cilindraje")
	private String cilindraje;
	@Column(name = "vehi_avaluo")
	private String avaluo;
	@Column(name = "vehi_valor_Dia")
	private BigDecimal valorDia;
	@Column(name = "vehi_estado")
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public void setAnioDeFabricacion(LocalDate anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}

	public String getPaisDeFabricacion() {
		return paisDeFabricacion;
	}

	public void setPaisDeFabricacion(String paisDeFabricacion) {
		this.paisDeFabricacion = paisDeFabricacion;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(String avaluo) {
		this.avaluo = avaluo;
	}

	public BigDecimal getValorDia() {
		return valorDia;
	}

	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca
				+ ", anioDeFabricacion=" + anioDeFabricacion + ", paisDeFabricacion=" + paisDeFabricacion
				+ ", cilindraje=" + cilindraje + ", avaluo=" + avaluo + ", valorDia=" + valorDia + ", estado=" + estado
				+ "]";
	}

}
