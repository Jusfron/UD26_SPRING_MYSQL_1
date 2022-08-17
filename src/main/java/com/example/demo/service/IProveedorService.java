package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedor;

public interface IProveedorService {

public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(String id);
	
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(String id);
	
}
