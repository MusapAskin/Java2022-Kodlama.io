package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping(value = "/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return this.languageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguagesRequest languageRequest) throws Exception {
		this.languageService.add(languageRequest);
	}

	@PutMapping("/update")
	public void update(CreateLanguagesRequest languageRequest) throws Exception {
		this.languageService.update(languageRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		this.languageService.delete(id);
	}

	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) throws Exception {
		return this.languageService.getById(id);
	}
}
