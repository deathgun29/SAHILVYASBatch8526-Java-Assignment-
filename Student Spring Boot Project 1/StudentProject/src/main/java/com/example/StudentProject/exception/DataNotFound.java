package com.example.StudentProject.exception;




//Exception if ID not found in Database
public  class DataNotFound extends Exception 
{
  private  String message;
  
  private static final long serialVersionUID = 1L;
	 public DataNotFound(String message) {
	super(String.format("%s",message));
	this.message = message;
}

	

	public DataNotFound () {
	        super();
	    }

	    
  public String getMessage() {
	return message;
}


//Getters and Setters
public void setMessage(String message) {
	this.message = message;
}



public static long getSerialversionuid() {
	return serialVersionUID;
}
	
}
