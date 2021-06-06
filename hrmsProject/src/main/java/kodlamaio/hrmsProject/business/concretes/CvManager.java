package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.CvService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.CvDao;
import kodlamaio.hrmsProject.entities.Cv;

@Service
public class CvManager implements CvService{

	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv added. ");
	}

	@Override
	public Result update(Cv cv) {
		
		this.cvDao.save(cv);
		return new SuccessResult("Cv updated. ");
	
	}


	@Override
	public DataResult<List<Cv>> getByCvIdForJobSeeker_Id(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll());
		
	}
	
	
	
}
