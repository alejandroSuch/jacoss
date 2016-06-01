package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.TranslatedNameDescriptionEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;

/**
 * Created by alejandro on 3/5/16.
 */
@Entity
@Table(name = TableNames.PRODUCT_DESCRIPTION)
public class ProductDescription extends TranslatedNameDescriptionEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_PRODUCT)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
