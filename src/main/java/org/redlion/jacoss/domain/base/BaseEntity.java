package org.redlion.jacoss.domain.base;

import org.hibernate.annotations.GenericGenerator;
import org.redlion.jacoss.domain.constants.ColumnNames;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by alejandro on 15/04/2016.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @Column(name = ColumnNames.COL_ID)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
