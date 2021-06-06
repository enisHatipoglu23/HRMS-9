package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.LinkService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.LinkDao;
import kodlamaio.hrmsProject.entities.Link;

@Service
public class LinkManager implements LinkService{
	
	private LinkDao linkDao;
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public Result add(Link link) {
		
		linkDao.save(link);
		return new SuccessResult("Link added. ");
	
	}

	@Override
	public DataResult<List<Link>> getAllByJobSeeker_Id(int jobSeeker) {
		
		return new SuccessDataResult<List<Link>>(this.linkDao.getAllByJobSeeker_Id(jobSeeker));
	
	}

}
