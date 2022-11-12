package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandservice;

	@Autowired
	public BrandsController(BrandService brandservice) {
		super();
		this.brandservice = brandservice;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {
		return brandservice.getAll();
	}
}
