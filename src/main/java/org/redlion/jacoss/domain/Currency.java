package org.redlion.jacoss.domain;

import org.redlion.jacoss.domain.base.BaseEntity;
import org.redlion.jacoss.domain.constants.TableNames;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by alejandro on 29/4/16.
 */
@Entity
@Table(name = TableNames.CURRENCY)
public class Currency extends BaseEntity {
    private String symbol;
}
