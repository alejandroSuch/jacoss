package org.redlion.jacoss;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Test;
import org.redlion.jacoss.base.BaseWebAppTest;
import org.redlion.jacoss.domain.Language;
import org.redlion.jacoss.repository.LanguageRepository;
import org.redlion.jacoss.service.LanguageService;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import javax.inject.Inject;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionDbUnitTestExecutionListener.class
})
@DatabaseSetup("languages.xml")
@DatabaseTearDown("languages.xml")
public class JacossApplicationTests extends BaseWebAppTest {
    @Inject
    LanguageService languageService;

    @Test
    public void contextLoadsAndDbUnitWorks() {
        final List<Language> allActive = languageService.getAllActive();

        assertThat(allActive).isNotNull();
        assertThat(allActive).isNotEmpty();
        assertThat(allActive.size()).isEqualTo(2);
    }
}
