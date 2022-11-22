package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	TechnologyRepository technologyRepository;
	List<Technology> technologies;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, List<Technology> technologies) {
		super();
		this.technologyRepository = technologyRepository;
		this.technologies = technologies;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> allTechnologiesResponses = new ArrayList<GetAllTechnologiesResponse>();
		for (Technology technology : technologies) {
			GetAllTechnologiesResponse technologiesResponse = new GetAllTechnologiesResponse();
			technologiesResponse.setId(technology.getId());
			technologiesResponse.setName(technology.getName());
			allTechnologiesResponses.add(technologiesResponse);
		}
		return allTechnologiesResponses;
	}

	@Override
	public void add(CreateTechnologiesRequest technologiesRequest) throws Exception {
		try {
			Technology technology = new Technology();
			isTechnologyExist(technologiesRequest.getName());
			isTechnologyNameEmpty(technologiesRequest.getName());
			technology.setName(technologiesRequest.getName());
			this.technologyRepository.save(technology);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void update(CreateTechnologiesRequest technologiesRequest) throws Exception {
		try {
			isTechnologyExist(technologiesRequest.getId());
			Technology technology = technologyRepository.getReferenceById(technologiesRequest.getId());
			technology.setName(technologiesRequest.getName());
			this.technologyRepository.save(technology);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(int id) throws Exception {
		try {
			isTechnologyExist(id);
			technologyRepository.delete(technologyRepository.getReferenceById(id));
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Technology getById(int id) throws Exception {
		try {
			isTechnologyExist(id);
			return technologyRepository.getReferenceById(id);
		} catch (Exception e) {
			throw e;
		}
	}

	public void isTechnologyExist(String name) throws Exception {
		for (Technology technology : technologyRepository.findAll()) {
			if (technology.getName().equals(name)) {
				throw new Exception("Technology exist.");
			}
		}
	}

	public void isTechnologyExist(int id) throws Exception {
		for (Technology technology : technologyRepository.findAll()) {
			if (technology.getId() == id)
				break;
			else {
				throw new Exception("Technology is not exist.");
			}
		}

	}

	public void isTechnologyNameEmpty(String name) throws Exception {
		if (name.isEmpty()) {
			throw new Exception("Technology name can not be empty.");
		}
	}

}
