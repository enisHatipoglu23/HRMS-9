package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.SkillService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.SkillDao;
import kodlamaio.hrmsProject.entities.Skill;

@Service
public class SkillManager implements SkillService{

	private SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Skill added. ");
	}

	@Override
	public DataResult<List<Skill>> getAllByJobSeekerId(int jobSeekerId) {
		
		return new SuccessDataResult<List<Skill>>(this.skillDao.getAllByJobSeeker_Id(jobSeekerId));
		
	}
	
}
