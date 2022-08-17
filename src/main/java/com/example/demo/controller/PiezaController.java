package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.PiezaServiceImpl;
import com.example.demo.dto.Pieza;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		return piezaServiceImpl.listarPiezas();
	}
	
	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name="id") int id) {
		
		Pieza Pieza_xid= new Pieza();
		
		Pieza_xid=piezaServiceImpl.piezaXID(id);
		
		System.out.println("Pieza XID: "+Pieza_xid);
		
		return Pieza_xid;
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id")int id,@RequestBody Pieza pieza) {
		
		Pieza pieza_seleccionado= new Pieza();
		Pieza pieza_actualizado= new Pieza();
		
		pieza_seleccionado= piezaServiceImpl.piezaXID(id);
		
		pieza_seleccionado.setNombre(pieza.getNombre());
		
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);
		
		System.out.println("La pieza actualizada es: "+ pieza_actualizado);
		
		return pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name="id")int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
	
}
