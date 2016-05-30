package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.redlion.jacoss.domain.constants.ColumnNames.*;
/**
 * Created by alejandro on 15/04/2016.
 */
@Entity
@Table(name = TableNames.CATEGORY_DESCRIPTION)
public class CategoryDescription extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ID_CATEGORY)
    Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ID_LANGUAGE)
    Language language;

    @NotNull
    @Size(min = 0, max = 255)
    @Column(name = NAME)
    String name;

    @NotNull
    @Column(name = DESCRIPTION, columnDefinition = "TEXT")
    String description;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
