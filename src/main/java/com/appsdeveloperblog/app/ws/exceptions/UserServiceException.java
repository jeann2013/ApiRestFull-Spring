package com.appsdeveloperblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	private static final long serialVersionUID = 125412541250007L;
	
	public UserServiceException(String message) 
	{
		super(message);
	}
}
