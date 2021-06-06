package kodlamaio.hrmsProject.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.School;

public interface SchoolService {

	Result add(School school);
	
	DataResult<List<School>> getByStartYearAndGraduationYear(LocalDate startYear, LocalDate graduationYear);
	
	DataResult<List<School>> getByStartYearAndStillContinue(LocalDate startYear, boolean stillContinue);
	
}
