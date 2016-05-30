package org.redlion.jacoss.domain.base;

import org.hibernate.annotations.GenericGenerator;
import org.redlion.jacoss.domain.constants.ColumnNames;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Created by alejandro on 15/04/2016.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Id
    @Column(name = ColumnNames.ID)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @CreatedDate
    @Column(name = ColumnNames.CREATION_TIME, nullable = false)
    private ZonedDateTime creationTime;

    @LastModifiedDate
    @Column(name = ColumnNames.MODIFICATION_TIME)
    private ZonedDateTime modificationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public ZonedDateTime getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(ZonedDateTime modificationTime) {
        this.modificationTime = modificationTime;
    }
}
