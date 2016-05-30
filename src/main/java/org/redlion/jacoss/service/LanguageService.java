package org.redlion.jacoss.service;

import org.redlion.jacoss.domain.Language;
import org.redlion.jacoss.repository.LanguageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by alejandro on 29/4/16.
 */
@Transactional
@Service
public class LanguageService {
    @Inject
    LanguageRepository languageRepository;

    public Language getDefaultLang() {
        return languageRepository.findByDefaultLangIsTrue();
    }

    public List<Language> getAllActive() {
        return languageRepository.findByActiveIsTrue();
    }

    public Language findByCode(String code) {
        return languageRepository.findByCode(code);
    }
}
