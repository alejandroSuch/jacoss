package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.TranslatedNameDescriptionEntity;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;

import static org.redlion.jacoss.domain.constants.ColumnNames.ID_CATEGORY;

/**
 * Created by alejandro on 15/04/2016.
 */
@Entity
@Table(name = TableNames.CATEGORY_DESCRIPTION)
public class CategoryDescription extends TranslatedNameDescriptionEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ID_CATEGORY)
    Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
