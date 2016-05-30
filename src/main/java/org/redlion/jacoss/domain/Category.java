package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by alejandro on 15/04/2016.
 */
@Entity
@Table(name = TableNames.CATEGORY)
public class Category extends BaseEntity {
    @Column(name = ColumnNames.CODE)
    private String code;

    @Min(1)
    @Column(name = ColumnNames.SORT_ORDER)
    private Integer sortOrder;

    @Column(name = ColumnNames.IS_ACTIVE)
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<Category> children;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<CategoryDescription> descriptions;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = TableNames.CATEGORY_MARKET,
            joinColumns = @JoinColumn(name = ColumnNames.ID_CATEGORY, referencedColumnName = ColumnNames.ID),
            inverseJoinColumns = @JoinColumn(name = ColumnNames.ID_MARKET, referencedColumnName = ColumnNames.ID)
    )
    Set<Market> markets;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    Set<Product> products;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getChildren() {
        if (this.children == null) {
            this.children = new HashSet<>();
        }
        return children;
    }

    public void setChildren(Set<Category> children) {
        this.children = children;
    }

    public Set<CategoryDescription> getDescriptions() {
        if (this.descriptions == null) {
            this.descriptions = new HashSet<>();
        }
        return descriptions;
    }

    public void setDescriptions(Set<CategoryDescription> descriptions) {
        this.descriptions = descriptions;
    }

    public Set<Market> getMarkets() {
        if (this.markets == null) {
            this.markets = new HashSet<>();
        }

        return markets;
    }

    public void setMarkets(Set<Market> markets) {
        this.markets = markets;
    }

    public Set<Product> getProducts() {
        if (this.products == null) {
            this.products = new HashSet<>();
        }

        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
