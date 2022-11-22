package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {

	List<GetAllLanguagesResponse> getAll();

	void add(CreateLanguageRequest languageRequest) throws Exception;

	void delete(CreateLanguageRequest languageRequest) throws Exception;

	void update(CreateLanguageRequest languageRequest) throws Exception;

	Language getById(int id) throws Exception;
}
