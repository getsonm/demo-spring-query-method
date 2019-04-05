/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dominios.UsuarioDominio;
import com.example.demo.repositorios.UsuarioRepositorio;

@SpringBootApplication
public class DemoSpringQueryMethodApplication implements CommandLineRunner  {

	@Autowired
	private UsuarioRepositorio ur;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringQueryMethodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		UsuarioDominio ud1 = new UsuarioDominio(null, "36364324002", "36364324002@email.com", "11998765432", "Nome1 CPF 36364324002", new Date(68,9,19), 435);
		UsuarioDominio ud2 = new UsuarioDominio(null, "24441867026", "24441867026@email.com", "11998765433", "Nome2 CPF 24441867026", new Date(70,8,27), 1800);
		UsuarioDominio ud3 = new UsuarioDominio(null, "24215311012", "24215311012@email.com", "11998765434", "Nome3 CPF 24215311012", new Date(95,6,20), 1935);
		UsuarioDominio ud4 = new UsuarioDominio(null, "10059727020", "10059727020@email.com", "11998765435", "Nome4 CPF 10059727020", new Date(01,10,01), 800);
		UsuarioDominio ud5 = new UsuarioDominio(null, "03845360003", "03845360003@email.com", "11998765436", "Nome4 CPF 03845360003", new Date(47,8,23), 1435);
		UsuarioDominio ud6 = new UsuarioDominio(null, "10171586069", "10171586069@email.com", "11998765437", "Nome 6CPF 10171586069", new Date(168,8,8), 2359);

		ur.save(ud1);
		ur.save(ud2);
		ur.save(ud3);
		ur.save(ud4);
		ur.save(ud5);
		ur.save(ud6);
		
	}

}
