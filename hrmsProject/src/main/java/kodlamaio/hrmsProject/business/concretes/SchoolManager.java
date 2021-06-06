package kodlamaio.hrmsProject.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.SchoolService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.SchoolDao;
import kodlamaio.hrmsProject.entities.School;

@Service
public class SchoolManager implements SchoolService{

	private SchoolDao schoolDao;
	
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getByStartYearAndGraduationYear(LocalDate startYear, LocalDate graduationYear) {
		
		return new SuccessDataResult<List<School>>(this.schoolDao.getByStartYearAndGraduationYear(startYear, graduationYear));
		
	}

	@Override
	public DataResult<List<School>> getByStartYearAndStillContinue(LocalDate startYear, boolean stillContinue) {
		
		return new SuccessDataResult<List<School>>(this.schoolDao.getByStartYearAndStillContinue(startYear, stillContinue));
		
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("School added. ");
	}

	

}
