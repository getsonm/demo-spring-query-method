/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.exceptions;

@SuppressWarnings("serial")
public class ObjectNotFoundException extends RuntimeException {

	public ObjectNotFoundException( String msg ) {
		super(msg);
	}
	
	public ObjectNotFoundException( String msg, Throwable cause ) {
		super(msg, cause);
	}
}
