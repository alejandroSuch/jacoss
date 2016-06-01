package org.redlion.jacoss.domain.base;

import org.hibernate.validator.constraints.NotBlank;
import org.redlion.jacoss.domain.constants.ColumnNames;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by alejandro on 31/5/16.
 */
@MappedSuperclass
public class NameDescriptionEntity extends BaseEntity {
    @NotBlank
    @Size(max = 255)
    @Column(name = ColumnNames.NAME)
    String name;

    @Column(name = ColumnNames.DESCRIPTION, columnDefinition = "TEXT")
    String description;

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
