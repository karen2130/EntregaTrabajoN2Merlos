package ar.edu.unju.fi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.model.Producto;
import ar.edu.unju.fi.service.ProductoService;

@Controller
public class ProductoController {
	private static final Log KAREN = LogFactory.getLog(ProductoController.class);;
	
	@Autowired
	ProductoService iProductoService;
	
	@GetMapping("/producto")
	public String cargarProducto(Model model) {
		model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("producto");
	}
	
	@PostMapping("/producto")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarProducto(nuevoProducto);
//mostrar el listado de producto luego de la carga de un producto
		System.out.println(iProductoService.obtenerTodosProductos().get(0).getMarca());
		model.addAttribute("productos", iProductoService.obtenerTodosProductos());
		KAREN.error("solo de prueba");    
		return "resultado";
	}
	
	@GetMapping("/ultimo")
	public String cargarUltimoProducto(Model model) {
		model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoProducto());
		return("mostrar-ultimo");
	}
	
	@GetMapping("/volver")
	public String cargarNuevoProducto(Model model) {
 //model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("redirect:/producto");
	}

}
