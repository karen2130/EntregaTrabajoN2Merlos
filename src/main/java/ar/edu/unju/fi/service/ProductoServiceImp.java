package ar.edu.unju.fi.service;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.service.ProductoServiceImp;
import ar.edu.unju.fi.model.Producto;

@Service
public class ProductoServiceImp implements ProductoService{
	
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);
	
	@Autowired
	Producto unProducto;
	
	ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto unProducto) {
		System.out.println(unProducto.getNombre());
		listaDeProductos.add(unProducto);

		System.out.println(listaDeProductos.size());
		
		LOGGER.info("METHOD: ingresando a Guardar Producto");
		LOGGER.info("RESULT: guardado " + listaDeProductos.get(listaDeProductos.size()-1).getNombre());
	}

	@Override
	public void modificarProducto(Producto productoAModificar) {
		
	}

	@Override
	public void eliminarProducto(Producto productoAEliminar) {
		
	}

	@Override
	public Producto obtenerUnProducto(String nombreProducto) {
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodosProductos() {
		return listaDeProductos;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		return unProducto;
	}

	@Override
	public Producto obtenerUltimoProducto() {
		int i = listaDeProductos.size() - 1;
		return listaDeProductos.get(i);
	}

}
