/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.repositorios;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dominios.UsuarioDominio;

@Repository
public interface UsuarioRepositorio extends JpaRepository <UsuarioDominio, Integer> {

	List <UsuarioDominio> findByDataBetween(Date ini, Date fim);
	
	List <UsuarioDominio> findByDataBetweenAndFone(Date ini, Date fim, String fone);
	
	List <UsuarioDominio> findByDataBetweenAndFoneAndCpf(Date ini, Date fim, String fone, String cpf);
	
}
