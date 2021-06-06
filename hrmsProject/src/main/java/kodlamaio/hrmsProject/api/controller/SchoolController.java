package kodlamaio.hrmsProject.api.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.SchoolService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.School;

@RestController
@RequestMapping("api/schools/")
public class SchoolController {

	private SchoolService schoolService;

	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	
	@PostMapping("addSchool")
	public Result add(@RequestBody School school) {
		
		return this.schoolService.add(school);
		
	}
	
	@GetMapping("getByStartYearAndGraduationYear")
	public DataResult<List<School>> getByStartYearAndGraduationYear(@RequestParam("startYear")  LocalDate startYear, @RequestParam("graduationYear") LocalDate graduationYear){
		
	
		return this.schoolService.getByStartYearAndGraduationYear(startYear, graduationYear);
		
	}
	
	@GetMapping("getByStartYearAndStillContinue")
	public DataResult<List<School>> getByStartYearAndStillContinue(@RequestParam("startYear") LocalDate startYear, @RequestParam("stillContinue") boolean  stillContinue){
		
		
		return this.schoolService.getByStartYearAndStillContinue(startYear, stillContinue);
		
	}
	
	
	
	
	
	
	
}
