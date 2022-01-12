package com.example.StudentProject.exception;




//Custom exception if Name not found in Database
public class NameNotFound extends Exception
{
	private String message;



/**
	 * 
	 */
private static final long serialVersionUID = 1L;


//Constructor 
public NameNotFound(String message) {
	super(String.format("%s",message));
	this.message = message;
}

	
//Empty Constructor
	public NameNotFound() {
	        super();
	    }
	
//Getters and Setters	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
