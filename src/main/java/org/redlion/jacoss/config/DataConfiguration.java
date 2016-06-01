package org.redlion.jacoss.config;

import org.redlion.jacoss.domain.auditing.AuditingDateTimeProvider;
import org.redlion.jacoss.domain.auditing.UsernameAuditorAware;
import org.redlion.jacoss.service.DateTimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by alejandro on 22/04/2016.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaAuditing(
        dateTimeProviderRef = "dateTimeProvider"
)
@EnableJpaRepositories("org.redlion.jacoss.repository")
public class DataConfiguration {
    @Bean
    DateTimeProvider dateTimeProvider(DateTimeService dateTimeService) {
        return new AuditingDateTimeProvider(dateTimeService);
    }

    @Bean
    //http://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-auditing-part-two/
    AuditorAware<String> auditorProvider() {
        return new UsernameAuditorAware();
    }
}
