package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	void add(Language language) throws Exception;

	void delete(int id) throws Exception;

	void update(int id, String name) throws Exception;

	Language getById(int id) throws Exception;
}
