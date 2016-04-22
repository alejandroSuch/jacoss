package org.redlion.jacoss.repository;

import org.redlion.jacoss.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alejandro on 22/04/2016.
 */
@Repository
public interface LanguageRepository extends JpaRepository<Language,String> {

}
