package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Proveedor;
import com.example.demo.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores() {
		return proveedorServiceImpl.listarProveedores();
	}
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") String id) {
		
		Proveedor Proveedor_xid= new Proveedor();
		
		Proveedor_xid=proveedorServiceImpl.proveedorXID(id);
		
		System.out.println("Proveedor XID: "+Proveedor_xid);
		
		return Proveedor_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedor proveedor) {
		
		Proveedor proveedor_seleccionado= new Proveedor();
		Proveedor proveedor_actualizado= new Proveedor();
		
		proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(proveedor_seleccionado);
		
		System.out.println("El Proveedor actualizado es: "+ proveedor_actualizado);
		
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name="id")String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
