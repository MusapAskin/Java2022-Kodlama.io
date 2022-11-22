package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping(value="/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest languageRequest) throws Exception {
		this.languageService.add(languageRequest);
	}

	/*
	 * @DeleteMapping("/{id}") public void delete(@PathVariable int id) throws
	 * Exception { languageService.delete(id); }
	 * 
	 * @PutMapping("/{id}") public void update(@PathVariable int id, String name)
	 * throws Exception { languageService.update(id, name); }
	 */
	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) throws Exception {
		return languageService.getById(id);
	}
}
