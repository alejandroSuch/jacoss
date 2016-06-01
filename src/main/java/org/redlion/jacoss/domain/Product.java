package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;
import java.util.Set;


/**
 * Created by alejandro on 3/5/16.
 */
@Entity
@Table(name = TableNames.PRODUCT)
public class Product extends BaseEntity {
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = TableNames.PRODUCT_CATEGORY,
            joinColumns = @JoinColumn(name = ColumnNames.ID_PRODUCT, referencedColumnName = ColumnNames.ID),
            inverseJoinColumns = @JoinColumn(name = ColumnNames.ID_CATEGORY, referencedColumnName = ColumnNames.ID)
    )
    Set<Category> categories;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = TableNames.PRODUCT_MARKET,
            joinColumns = @JoinColumn(name = ColumnNames.ID_PRODUCT, referencedColumnName = ColumnNames.ID),
            inverseJoinColumns = @JoinColumn(name = ColumnNames.ID_CATEGORY, referencedColumnName = ColumnNames.ID)
    )
    Set<Market> markets;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    Set<ProductDescription> descriptions;

    @Column(name = ColumnNames.IS_ACTIVE)
    private Boolean active;

}
