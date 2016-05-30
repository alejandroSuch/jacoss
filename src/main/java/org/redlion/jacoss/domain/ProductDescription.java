package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.constants.ColumnNames;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by alejandro on 3/5/16.
 */
public class ProductDescription {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_PRODUCT)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_LANGUAGE)
    Language language;

    @NotNull
    @Size(max = 255)
    @Column(name = ColumnNames.NAME)
    String name;

    @NotNull
    @Size(max = 2040)
    @Column(name = ColumnNames.DESCRIPTION)
    String description;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
