package service;

public interface CredentialServices {
	
	String generateEmail(String firstname, String lastname, String department );
	String generatePassword(String firstname, String lastname);

}
