package com.microcredential.userservice.exceptions;

public class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	String message;

	public UserAlreadyExistsException (String userName){
		super (userName);
		this.message = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "User already [message=" + message + "]";
	}
	
}
