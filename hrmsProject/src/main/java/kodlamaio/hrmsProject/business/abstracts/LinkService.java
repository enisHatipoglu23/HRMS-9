package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Link;

public interface LinkService {

	Result add(Link link);
	
	DataResult<List<Link>>  getAllByJobSeeker_Id(int jobSeeker);
	
}
