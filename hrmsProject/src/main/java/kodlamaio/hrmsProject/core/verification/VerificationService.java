package kodlamaio.hrmsProject.core.verification;

public interface VerificationService {

	public boolean validWtihMail(String email);
	public boolean validWtihPersonnel(int userId);
	boolean checkIfRealPerson(String nationalityNumber, String firstName, String lastName, int birthDate);
	
}
