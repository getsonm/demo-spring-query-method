/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.recursos;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dominios.UsuarioDominio;
import com.example.demo.servicos.UsuarioServico;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRecurso {
	
	@Autowired
	private UsuarioServico us;

	@RequestMapping(value="", method=RequestMethod.GET)
	public ResponseEntity <?> find() {
		
		List<UsuarioDominio> ud = us.buscaTodos();
		return ResponseEntity.ok().body(ud);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Integer id) {
		
		UsuarioDominio ud = us.buscarPorID(id);
		return ResponseEntity.ok().body(ud);
		
	}
	
	@RequestMapping(value="/{dataInicial}/{dataFinal}", method=RequestMethod.GET)
	public List <UsuarioDominio> findBydtInicialAnddtFinal(@PathVariable Date dataInicial, @PathVariable Date dataFinal) {
		
		List <UsuarioDominio> ud = us.buscarPordtInicialAnddtFinal(dataInicial, dataFinal);
		return ud;
		
	}
	
	@RequestMapping(value="/{dataInicial}/{dataFinal}/{telefone}", method=RequestMethod.GET)
	public List <UsuarioDominio> findBydtInicialAnddtFinalAndTelefone(@PathVariable Date dataInicial, @PathVariable Date dataFinal, 
			@PathVariable String telefone) {
		
		List <UsuarioDominio> ud = us.buscarPordtInicialAnddtFinalAndFone(dataInicial, dataFinal, telefone);
		return ud;
		
	}
	
	@RequestMapping(value="/{dataInicial}/{dataFinal}/{telefone}/{cpf}", method=RequestMethod.GET)
	public List <UsuarioDominio> findBydtInicialAnddtFinalAndTelefone(@PathVariable Date dataInicial, @PathVariable Date dataFinal, 
			@PathVariable String telefone, @PathVariable String cpf) {
		
		List <UsuarioDominio> ud = us.buscarPordtInicialAnddtFinalAndFoneAndCpf(dataInicial, dataFinal, telefone, cpf);
		return ud;
		
	}
	
	

}
