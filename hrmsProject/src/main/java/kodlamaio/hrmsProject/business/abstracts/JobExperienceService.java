package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.JobExperience;

public interface JobExperienceService {

	Result add(JobExperience jobExperinence);
	
	DataResult<List<JobExperience>> getAllByJobSeekerIdOrderByResignationTimeDesc(int jobSeekerId);
	
	DataResult<List<JobExperience>> getAllByJobSeekerId(int jobSeekerId);
	
}
