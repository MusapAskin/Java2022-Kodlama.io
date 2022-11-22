package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import kodlama.io.Kodlama.io.Devs.business.responces.GetAllLanguagesResponse;
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
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> brandsResponse = new ArrayList<GetAllLanguagesResponse>();
		for (Language language : languages) {
			GetAllLanguagesResponse allLanguagesResponse = new GetAllLanguagesResponse();
			allLanguagesResponse.setId(language.getId());
			allLanguagesResponse.setName(language.getName());
			brandsResponse.add(allLanguagesResponse);
		}

		return brandsResponse;
	}

	@Override
	public void add(CreateLanguagesRequest languageRequest) throws Exception {
		try {
			Language language = new Language();
			isLanguageExist(languageRequest.getName());
			isLanguageNameEmpty(languageRequest.getName());
			language.setName(languageRequest.getName());
			this.languageRepository.save(language);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(int id) throws Exception {
		isLanguageExist(id);
		languageRepository.delete(languageRepository.getReferenceById(id));
	}

	@Override
	public void update(CreateLanguagesRequest languageRequest) throws Exception {
		try {
			isLanguageExist(languageRequest.getId());
			Language language = languageRepository.getReferenceById(languageRequest.getId());
			language.setName(languageRequest.getName());
			this.languageRepository.save(language);
		} catch (Exception e) {
			throw e;
		}
	}

	public Language getById(int id) throws Exception {
		try {
			isLanguageExist(id);
			return languageRepository.getReferenceById(id);
		} catch (Exception e) {
			throw e;
		}
	}

	public void isLanguageExist(String name) throws Exception {
		for (Language language : languageRepository.findAll()) {
			if (language.getName().equals(name)) {
				throw new Exception("Language exist.");
			}
		}
	}

	public void isLanguageExist(int id) throws Exception {
		for (Language language : languageRepository.findAll()) {
			if (language.getId() == id)
				break;
			else {
				throw new Exception("Language is not exist.");
			}
		}

	}

	public void isLanguageNameEmpty(String name) throws Exception {
		if (name.isEmpty()) {
			throw new Exception("Language name can not be empty.");
		}
	}
}
