package org.redlion.jacoss.domain.base;

import org.redlion.jacoss.domain.Language;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import static org.redlion.jacoss.domain.constants.ColumnNames.ID_LANGUAGE;

/**
 * Created by alejandro on 31/5/16.
 */
@MappedSuperclass
public class TranslatedNameDescriptionEntity extends NameDescriptionEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ID_LANGUAGE)
    Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
