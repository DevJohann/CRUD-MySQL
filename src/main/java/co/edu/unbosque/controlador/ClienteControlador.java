package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Cliente;
import co.edu.unbosque.repositorio.ClienteRepositorio;

@RestController //API REST
@RequestMapping("/api/v1/")
public class ClienteControlador {
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	@GetMapping("/clientes")
	public List<Cliente> listarTodosClientes(){
		return repositorio.findAll();
	}
}