package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {

public List<Suministra> listarSuministra();
	
	public Suministra guardarSuministra(Suministra suministra);
	
	public Suministra suministraXID(int id);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void eliminarSuministra(int id);
	
}
