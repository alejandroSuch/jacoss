package org.redlion.jacoss.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.redlion.jacoss.domain.Market;
import org.redlion.jacoss.dto.MarketDTO;
import org.springframework.stereotype.Component;

/**
 * Created by alejandro on 25/4/16.
 */
@Component
@Mapper(componentModel = "spring")
public interface MarketMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(expression = "java(market.getDescriptions().iterator().next().getLanguage().getCode())", target = "lang"),
            @Mapping(expression = "java(market.getDescriptions().iterator().next().getDescription())", target = "description"),
            @Mapping(source = "active", target = "active"),
            @Mapping(source = "sortOrder", target = "sortOrder")
    })
    MarketDTO toMarketDto(Market market);
}

