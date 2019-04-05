/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.dominios;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioDominio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String cpf;
	String email;
	String fone;
	String nome;
	Date data;
	Integer hora;
	
	public UsuarioDominio() {
	}
	
	public UsuarioDominio(Integer id, String cpf, String email, String fone, String nome, Date data, Integer hora) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.fone = fone;
		this.nome = nome;
		this.data = data;
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDominio other = (UsuarioDominio) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioDominio [id=" + id + ", cpf=" + cpf + ", email=" + email + ", fone=" + fone + ", nome=" + nome
				+ ", data=" + data + ", hora=" + hora + "]";
	}
	
}
