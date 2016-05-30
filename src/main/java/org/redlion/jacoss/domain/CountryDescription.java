package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.redlion.jacoss.domain.constants.ColumnNames.DESCRIPTION;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TableNames.COUNTRY_DESCRIPTION)
public class CountryDescription extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_COUNTRY)
    Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_LANGUAGE)
    Language language;

    @NotNull
    @Size(max = 255)
    @Column(name = DESCRIPTION)
    String description;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
