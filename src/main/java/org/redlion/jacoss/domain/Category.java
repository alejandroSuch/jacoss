package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;

import javax.persistence.*;
import java.util.Set;

import static org.redlion.jacoss.domain.constants.ColumnNames.*;
import static org.redlion.jacoss.domain.constants.TableNames.TBL_CATEGORIES;

/**
 * Created by alejandro on 15/04/2016.
 */
@Entity
@Table(name = TBL_CATEGORIES)
public class Category extends BaseEntity {
    @Column(name = COL_CODE)
    private String code;

    @Column(name = COL_SORT_ORDER)
    private Integer sortOrder;

    @Column(name = COL_IS_ACTIVE)
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = COL_ID_CATEGORY)
    Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", fetch = FetchType.LAZY)
    Set<Category> children;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    Set<CategoryDescription> descriptions;
}
