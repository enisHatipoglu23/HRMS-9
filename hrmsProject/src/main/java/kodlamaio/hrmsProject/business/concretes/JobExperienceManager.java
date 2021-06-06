package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.JobExperienceService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.JobExperienceDao;
import kodlamaio.hrmsProject.entities.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperinence) {
		this.jobExperienceDao.save(jobExperinence);
		return new SuccessResult("Job Experience Added. ");
	}

	@Override
	public DataResult<List<JobExperience>> getAllByJobSeekerIdOrderByResignationTimeDesc(int jobSeekerId) {
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByJobSeeker_IdOrderByResignationTimeDesc(jobSeekerId));
	}

	@Override
	public DataResult<List<JobExperience>> getAllByJobSeekerId(int jobSeekerId) {
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getAllByJobSeeker_Id(jobSeekerId));
	}
	


		
}
