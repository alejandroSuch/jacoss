package org.redlion.jacoss.dto;

/**
 * Created by alejandro on 25/4/16.
 */
public class MarketDTO {
    private String id;
    private String code;
    private String lang;
    private String description;
    private Boolean active;
    private Integer sortOrder;

    public String getId() {
        return id;
    }

    public MarketDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public MarketDTO setCode(String code) {
        this.code = code;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public MarketDTO setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public MarketDTO setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public Boolean isActive() {
        return active;
    }

    public MarketDTO setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MarketDTO setDescription(String description) {
        this.description = description;
        return this;
    }


}
