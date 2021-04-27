package ar.edu.unju.fi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Producto;

@Service
public interface ProductoService {
	
	public void guardarProducto(Producto unProducto);
	public void modificarProducto(Producto productoAModificar);
	public void eliminarProducto(Producto productoAEliminar);
	public Producto obtenerUnProducto(String nombreProducto);
	public ArrayList<Producto> obtenerTodosProductos();
	public Producto obtenerProductoNuevo();
	public Producto obtenerUltimoProducto();

}