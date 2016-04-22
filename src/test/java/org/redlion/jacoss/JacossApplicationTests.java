package org.redlion.jacoss;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Test;
import org.redlion.jacoss.base.BaseWebAppTest;
import org.redlion.jacoss.domain.Language;
import org.redlion.jacoss.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

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
    @Autowired
    LanguageRepository languageRepository;

    @Test
    public void contextLoadsAndDbUnitWorks() {
        final List<Language> all = languageRepository.findAll();

        assertThat(all).isNotNull();
        assertThat(all).isNotEmpty();
        assertThat(all.size()).isEqualTo(2);
    }
}
