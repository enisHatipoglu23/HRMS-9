package kodlamaio.hrmsProject.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.JobAdvertisementService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.ErrorDataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.JobAdvertisementDao;
import kodlamaio.hrmsProject.entities.JobAdvertisement;

@Service("JobAdvertisementManager")
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(), "All JOB ADVERTİSEMENTS has been listed. ");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName) {
		
		if(!isActive == true) {
			
			return new ErrorDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive(false), "Job advertisement is not active...");
		
		}
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveAndEmployer_CompanyName(isActive, companyName), "Job advertisement is active and here is the company name: ");
	
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("JOB ADVERTİSEMENT has been added on the Panel.");
	
	}
	

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
		
		if(isActive != true) {
			return new ErrorDataResult<List<JobAdvertisement>>("Advertisement is not active now. ");
		}
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive(isActive), "ADVERTISEMENT IS ACTIVE, YOU CAN ADD YOUR CV HERE!!! ");
	
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndPublishedDate(boolean isActive, Date publishedDate) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveAndPublishedDate(isActive, publishedDate), "Advertisement is active and here is advertisements published date: ");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByExpirationDate() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "advertisementExprationDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Advertisements has listed to their expiration date: ");
		
	}
	

	

	
	
}
