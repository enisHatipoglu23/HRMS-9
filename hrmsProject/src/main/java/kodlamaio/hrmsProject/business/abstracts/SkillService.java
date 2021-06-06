package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Skill;

public interface SkillService {

	Result add(Skill skill);
	DataResult<List<Skill>> getAllByJobSeekerId(int jobSeekerId);
	
}
