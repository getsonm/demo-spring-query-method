/**
	Exemplo de buscas por query method com Spring Boot
	getson.miranda@gmail.com
	04/04/2019
	=;)
*/
package com.example.demo.exceptions;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DefaultError implements Serializable {
	
	private Integer error;
	private String msg;
	private Long timeStamp;
	
	public DefaultError(Integer error, String msg, Long timeStamp) {
		super();
		this.error = error;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
