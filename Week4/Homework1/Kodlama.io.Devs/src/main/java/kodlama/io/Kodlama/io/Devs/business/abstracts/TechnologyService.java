package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologiesRequest technologiesRequest) throws Exception;

	void update(CreateTechnologiesRequest technologiesRequest) throws Exception;

	void delete(int id) throws Exception;

	Technology getById(int id) throws Exception;
}
