package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int id);
	
}
