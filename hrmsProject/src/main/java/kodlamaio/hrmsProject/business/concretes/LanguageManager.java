package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.LanguageService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.LanguageDao;
import kodlamaio.hrmsProject.entities.Language;

@Service
public class  LanguageManager implements LanguageService {

private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}


	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Language added. ");
	}


	@Override
	public DataResult<List<Language>> getAllByCandidateId(int candidateId) {
		
		return new SuccessDataResult<List<Language>>(this.languageDao.getAllByJobSeeker_Id(candidateId)) ;
	}


	

	
}
