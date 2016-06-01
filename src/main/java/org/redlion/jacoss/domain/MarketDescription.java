package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.TranslatedNameDescriptionEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TableNames.MARKET_DESCRIPTION)
public class MarketDescription extends TranslatedNameDescriptionEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.ID_MARKET)
    private Market market;

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
}
