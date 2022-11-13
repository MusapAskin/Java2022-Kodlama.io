package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	LanguageRepository languageRepository;
	List<Language> languages;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository, List<Language> languages) {
		super();
		this.languageRepository = languageRepository;
		this.languages = languages;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		try {
			isLanguageNameEmpty(language);
			isLanguageExist(language.getName());
			languages.add(language);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(int id) throws Exception {
		try {
			isLanguageExist(id);
			languageRepository.delete(id);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void update(int id, String name) throws Exception {
		try {
			isLanguageExist(id);
			languageRepository.update(id, name);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Language getById(int id) throws Exception {
		try {
			isLanguageExist(id);
			return languageRepository.getById(id);
		} catch (Exception e) {
			throw e;
		}
	}

	private void isLanguageExist(String languageName) throws Exception {
		for (Language language : languages) {
			if (language.getName().equals(languageName)) {
				throw new Exception("Language exist.");
			}
		}
	}

	private void isLanguageExist(int id) throws Exception {
		for (Language language : languages) {
			if (!(language.getId() == id)) {
				throw new Exception("Language id is not exist.");
			}
		}
	}

	private void isLanguageNameEmpty(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Language name can not be empty.");
		}
	}
}
