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

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@RestController
@RequestMapping(value = "/api/Tecnologies")
public class TechnologiesController {
	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}

	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return this.technologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateTechnologiesRequest technologiesRequest) throws Exception {
		this.technologyService.add(technologiesRequest);
	}

	@PutMapping("/update")
	public void update(CreateTechnologiesRequest technologiesRequest) throws Exception {
		this.technologyService.update(technologiesRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		this.technologyService.delete(id);
	}

	@GetMapping("/{id}")
	public Technology getById(@PathVariable int id) throws Exception {
		return this.technologyService.getById(id);
	}
}
