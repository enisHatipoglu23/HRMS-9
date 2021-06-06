package kodlamaio.hrmsProject.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.LanguageService;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.Language;

@RestController
@RequestMapping("/api/languages/")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService ) {
		super();
		this.languageService = languageService;
	}
	
	
	@PostMapping("add")
	public Result add(@RequestBody @Valid Language language ) {
		
		return this.languageService.add(language);
	}
	
}
