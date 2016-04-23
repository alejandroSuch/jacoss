package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

import static org.redlion.jacoss.domain.constants.ColumnNames.*;
import static org.redlion.jacoss.domain.constants.TableNames.TBL_MARKETS;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TBL_MARKETS)
public class Market extends BaseEntity {
    @NotNull
    @Column(name = COL_CODE, unique = true)
    @Size(max = 2, min = 2)
    private String code;

    @Min(1)
    @Column(name = COL_SORT_ORDER)
    private Integer sortOrder;

    @Column(name = COL_IS_ACTIVE)
    private Boolean active;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "market", cascade = CascadeType.ALL)
    private Set<MarketDescription> descriptions;

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

    public Set<MarketDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<MarketDescription> descriptions) {
        this.descriptions = descriptions;
    }
}
