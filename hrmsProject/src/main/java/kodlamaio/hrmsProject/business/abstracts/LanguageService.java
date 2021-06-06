package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Language;

public interface LanguageService {

	Result add(Language language);
	
	DataResult<List<Language>> getAllByCandidateId(int candidateId);	
	
}
