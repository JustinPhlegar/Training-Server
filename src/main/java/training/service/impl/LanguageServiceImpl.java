package training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import training.database.dao.impl.LanguageDaoImpl;
import training.generated.Language;
import training.service.LanguageService;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
	@Lazy @Autowired private LanguageDaoImpl languageDao;
	@Override
	public List<Language> getAllLanguages() {
		return languageDao.getAll();
	}

	@Override
	public Language getLanguageById(long languageId) {
		Language language = new Language();
		language.setLanguageId(languageId);
		language.setName(languageDao.getLanguage(languageId));
		return language;
	}

	@Override
	public Language getLanguageByName(String name) {
		Language language = new Language();
		language.setName(name);
		language.setLanguageId(languageDao.getId(name));
		return language;
	}
}
