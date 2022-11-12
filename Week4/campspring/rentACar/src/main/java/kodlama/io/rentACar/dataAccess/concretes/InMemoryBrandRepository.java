package kodlama.io.rentACar.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements kodlama.io.rentACar.dataAccess.abstracts.BrandRepository {
	List<Brand> brands;

	public InMemoryBrandRepository(List<Brand> brands) {
		super();
		brands.add(new Brand(1, "Mercedes"));
		this.brands = brands;
	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
