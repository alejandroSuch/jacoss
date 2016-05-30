package org.redlion.jacoss.repository;

import org.redlion.jacoss.domain.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alejandro on 22/04/2016.
 */
@Repository
public interface LanguageRepository extends CrudRepository<Language, String> {
    Language findByCode(String code);
    Language findByDefaultLangIsTrue();
    List<Language> findByActiveIsTrue();
}
