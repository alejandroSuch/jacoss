package org.redlion.jacoss.config;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by alejandro on 25/4/16.
 */
@Configuration
@EnableCaching
public class CacheConfiguration {
    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(getDailyCache(), getHourlyCache()));
        return cacheManager;
    }

    private GuavaCache getDailyCache() {
        return new GuavaCache(
                "dailyCache",
                CacheBuilder
                        .newBuilder()
                        .expireAfterWrite(1, TimeUnit.DAYS)
                        .maximumSize(100)
                        .build()
        );
    }

    private GuavaCache getHourlyCache() {
        return new GuavaCache(
                "hourlyCache",
                CacheBuilder
                        .newBuilder()
                        .expireAfterWrite(1, TimeUnit.HOURS)
                        .maximumSize(100)
                        .build()
        );
    }
}
