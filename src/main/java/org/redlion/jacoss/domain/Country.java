package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TableNames.COUNTRY)
public class Country extends BaseEntity {
    @NotNull
    @Size(min = 2, max = 2)
    @Column(name = ColumnNames.CODE, unique = true)
    private String code;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CountryDescription> descriptions;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<CountryDescription> getDescriptions() {
        if(descriptions == null) {
            this.descriptions = new HashSet<>();
        }

        return descriptions;
    }

    public void setDescriptions(Set<CountryDescription> descriptions) {
        this.descriptions = descriptions;
    }
}
