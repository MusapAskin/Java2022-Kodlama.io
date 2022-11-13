package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	private List<Language> languages;

	public InMemoryLanguageRepository(List<Language> languages) {
		super();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "C++"));
		languages.add(new Language(4, "Python"));
		this.languages = languages;
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(int id, String name) {
		languages.get(id).setName(name);
	}

	@Override
	public Language getById(int id) {
		return languages.get(id);

	}

}
