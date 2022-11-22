package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();

	void add(CreateLanguagesRequest languageRequest) throws Exception;

	void update(CreateLanguagesRequest languageRequest) throws Exception;

	void delete(int id) throws Exception;

	Language getById(int id) throws Exception;
}
