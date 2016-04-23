package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.*;

/**
 * Created by alejandro on 22/4/16.
 */
@Entity
@Table(name = TableNames.TBL_MARKETS_DESCRIPTION)
public class MarketDescription extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ColumnNames.COL_ID_MARKET)
    private Market market;
}
