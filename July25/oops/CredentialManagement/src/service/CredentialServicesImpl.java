package service;

public class CredentialServicesImpl implements CredentialServices {

	@Override
	public String generateEmail(String firstname, String lastname,String department) {
		
		return firstname+lastname+"@"+department+".wipro.com";
	}

	@Override
	public String generatePassword(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return firstname+lastname+"123";
	}
	
	
	public void showCredentials(String firstname, String lastname,String department){
		
		
		System.out.println("Emailid="+ generateEmail(firstname,lastname, department));
		System.out.println("password="+generatePassword(firstname, lastname));
	}

}
