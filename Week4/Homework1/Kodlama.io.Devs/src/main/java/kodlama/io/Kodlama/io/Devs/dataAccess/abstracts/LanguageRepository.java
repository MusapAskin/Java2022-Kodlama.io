package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import java.util.List;

public interface LanguageRepository {
	List<Language> getAll();

	void add(Language language);

	void delete(int id);

	void update(int id, String name);

	Language getById(int id);
}
