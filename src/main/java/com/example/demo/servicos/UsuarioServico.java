/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.servicos;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominios.UsuarioDominio;
import com.example.demo.exceptions.ObjectNotFoundException;
import com.example.demo.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepositorio ur;
	
	public List <UsuarioDominio> buscaTodos() {
		List <UsuarioDominio> ud = ur.findAll();
		return ud;
	}
	
	public UsuarioDominio buscarPorID(Integer id) {
		Optional <UsuarioDominio> ud = ur.findById(id);
		return ud.orElseThrow(() -> new ObjectNotFoundException(
				"Cliente não existe! Id: " + id + ", Tipo: " + UsuarioDominio.class.getName()));
	}
	
	public List<UsuarioDominio> buscarPordtInicialAnddtFinal(Date ini, Date fim) {
		List <UsuarioDominio> ud =  ur.findByDataBetween (ini, fim);
		return ud;
	}
	
	public List<UsuarioDominio> buscarPordtInicialAnddtFinalAndFone(Date ini, Date fim, String fone) {
		List <UsuarioDominio> ud =  ur.findByDataBetweenAndFone (ini, fim, fone);
		return ud;
	}

	public List<UsuarioDominio> buscarPordtInicialAnddtFinalAndFoneAndCpf(Date ini, Date fim, String fone, String cpf) {
		List <UsuarioDominio> ud =  ur.findByDataBetweenAndFoneAndCpf (ini, fim, fone, cpf);
		return ud;
	}
	
}
