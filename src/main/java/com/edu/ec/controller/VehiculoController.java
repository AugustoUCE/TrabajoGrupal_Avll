package com.edu.ec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.ec.repository.modelo.Vehiculo;
import com.edu.ec.service.IVehiculoService;
//http://localhost:8080/vehiculos/buscarMarcaModelo
@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/buscarMarcaModelo")
	public String buscarMarcaModelo(Vehiculo vehiculo,Model model) {
		List<Vehiculo> list = this.vehiculoService.buscarMarcarModelo(vehiculo.getMarca(), vehiculo.getModelo());
		model.addAttribute("vehiculos", list);
		return "VVehiculoMarcaModelo";
	}

}
