package kodlamaio.hrmsProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.SkillService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Skill;

@RestController
@RequestMapping("/api/skills/")
public class SkillController {

	private SkillService skillService;

	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("addSkills")
	public Result add(@RequestBody Skill skill) {
		
		return this.skillService.add(skill);
		
	}
	
	@GetMapping("getAllJobSeekersId")
	public DataResult<List<Skill>> getAllByJobSeekerId(@RequestParam("jobSeekerId") int jobSeekerId){
		
		return this.skillService.getAllByJobSeekerId(jobSeekerId);
		
	}
	
	
}
