package kodlamaio.hrmsProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobExperienceService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.JobExperience;

@RestController
@RequestMapping("/api/jobExperinces/")
public class JobExperienceController {

	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}
	
	@GetMapping("getAllByJobSeekerIdOrderByResignationTimeDesc")
	public DataResult<List<JobExperience>> getAllByJobSeekerIdOrderByResignationTimeDesc(@RequestParam("jobSeekerId") int jobSeekerId){
		
		return this.jobExperienceService.getAllByJobSeekerIdOrderByResignationTimeDesc(jobSeekerId);
		
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<JobExperience>> getAllByJobSeekerId(@RequestParam("jobSeekerId") int jobSeekerId) {
		
		return this.jobExperienceService.getAllByJobSeekerId(jobSeekerId);
		
	}
}
