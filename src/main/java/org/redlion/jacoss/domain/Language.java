package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.redlion.jacoss.domain.constants.ColumnNames.*;
import static org.redlion.jacoss.domain.constants.Indexes.IDX_LANGUAGE_CODE;

/**
 * Created by alejandro on 15/04/2016.
 */
@Entity
@Table(
        name = TableNames.LANGUAGE,
        indexes = {
                @Index(name = IDX_LANGUAGE_CODE, columnList = CODE)
        }
)
public class Language extends BaseEntity {
    @NotNull
    @Size(max = 255)
    @Column(name = NAME)
    private String name;

    @NotNull
    @Size(max = 2, min = 2)
    @Column(name = CODE, unique = true)
    private String code;

    @Min(1)
    @Column(name = SORT_ORDER)
    private Integer sortOrder;

    @Column(name = IS_DEFAULT, columnDefinition = "TINYINT(1)")
    private Boolean defaultLang = Boolean.FALSE;

    @Column(name = IS_ACTIVE, columnDefinition = "TINYINT(1)")
    private Boolean active = Boolean.TRUE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return ISO 3166-1 alpha-2
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean isDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(Boolean defaultLang) {
        this.defaultLang = defaultLang;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Language language = (Language) o;

        return code.equals(language.code);

    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
