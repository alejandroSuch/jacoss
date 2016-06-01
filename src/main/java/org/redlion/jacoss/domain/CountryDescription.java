package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.TranslatedNameDescriptionEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TableNames.COUNTRY_DESCRIPTION)
public class CountryDescription extends TranslatedNameDescriptionEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_COUNTRY)
    Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
