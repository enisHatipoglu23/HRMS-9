package kodlamaio.hrmsProject.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.CvService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Cv;

@RestController
@RequestMapping("/api/cvs/")
public class CvController {

	private CvService cvService;

	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	public DataResult<List<Cv>> getAll(){
		
		return this.cvService.getAll();
		
	}
	
	@PostMapping("addcvs")
	public Result add(@RequestBody Cv cv) {
		
		return this.cvService.add(cv);
		
	}
	
	@PostMapping("updatecvs")
	public Result update(@RequestBody Cv cv) {
		
		return this.cvService.update(cv);
		
	}
	
	public DataResult<List<Cv>> getAllByIdForJobSeeker_Id(@RequestParam("id") int id){
		
		return this.cvService.getByCvIdForJobSeeker_Id(id);
		
	}
	
	
	
	
}
