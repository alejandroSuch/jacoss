package org.redlion.jacoss.dto;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.redlion.jacoss.base.BaseUnitTest;
import org.redlion.jacoss.domain.Language;
import org.redlion.jacoss.domain.Market;
import org.redlion.jacoss.domain.MarketDescription;
import org.redlion.jacoss.dto.mapper.MarketMapper;

import javax.inject.Inject;

/**
 * Created by alejandro on 25/4/16.
 */
public class DtoMappingTest extends BaseUnitTest {

    @Inject
    MarketMapper marketMapper;

    @Test
    public void itMapsProperlyAMarket() {
        final Market market = new Market();

        market.setId("1");
        market.setCode("es");
        market.setSortOrder(1);
        market.setActive(true);
        market.getDescriptions().add(createMarketDescription());

        final MarketDTO marketDTO = marketMapper.toMarketDto(market);
        final SoftAssertions assertions = new SoftAssertions();

        assertions
                .assertThat(marketDTO.getId())
                .isEqualTo("1");

        assertions
                .assertThat(marketDTO.getCode())
                .isEqualTo("es");

        assertions
                .assertThat(marketDTO.getDescription())
                .isEqualTo("España");

        assertions
                .assertThat(marketDTO.isActive())
                .isEqualTo(Boolean.TRUE);

        assertions
                .assertThat(marketDTO.getSortOrder())
                .isEqualTo(1);

        assertions.assertAll();

    }

    private MarketDescription createMarketDescription() {
        final MarketDescription marketDescription = new MarketDescription();
        marketDescription.setId("1");
        marketDescription.setDescription("España");
        marketDescription.setLanguage(createLang());
        return marketDescription;
    }

    private Language createLang() {
        Language language = new Language();
        language.setId("1");
        language.setActive(true);
        language.setCode("es");
        language.setDefaultLang(true);
        language.setName("Español");
        language.setSortOrder(1);

        return language;
    }
}
