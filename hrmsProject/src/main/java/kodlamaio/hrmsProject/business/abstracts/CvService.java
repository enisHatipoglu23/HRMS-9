package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Cv;

public interface CvService {

	Result add(Cv cv);
	Result update(Cv cv);
	
	DataResult<List<Cv>>  getByCvIdForJobSeeker_Id(int id);
	
	DataResult<List<Cv>>  getAll();
	
}
