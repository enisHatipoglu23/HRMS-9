package kodlamaio.hrmsProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.LinkService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Link;

@RestController
@RequestMapping("/links/")
public class LinkController {

	private LinkService linkService;

	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@PostMapping("addLink")
	public Result add(@RequestBody Link link) {
		
		return this.linkService.add(link);
		
	}
	
	@GetMapping("getAllJobSeekerId")
	public DataResult<List<Link>> getAllByJobSeeker_Id(@RequestParam("jobSeeker") int jobSeeker) {
		
		return this.linkService.getAllByJobSeeker_Id(jobSeeker);
		
	}
	
	
	
}
