package com.microcredential.userservice.exceptions;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	String message;

	public UserNotFoundException(String userName){
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
		return "User not found [message=" + message + "]";
	}
	
}
