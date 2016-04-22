package org.redlion.jacoss.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by alejandro on 22/04/2016.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("org.redlion.jacoss.repository")
public class DataConfig {
}
