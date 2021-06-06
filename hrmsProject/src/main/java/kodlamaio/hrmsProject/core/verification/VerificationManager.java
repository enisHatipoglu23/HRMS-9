package kodlamaio.hrmsProject.core.verification;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService{

	@Override
	public boolean validWtihMail(String email) {
		return true;
	}

	@Override
	public boolean validWtihPersonnel(int userId) {
		return true;
	}

	@Override
	public boolean checkIfRealPerson(String nationalityNumber, String firstName, String lastName, int birthDate) {

        try {
            return  checkIfRealPerson
            		(nationalityNumber, firstName.toUpperCase(), 
            				lastName.toUpperCase(), birthDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return true;
	}

}
