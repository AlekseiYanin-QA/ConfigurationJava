package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Qualifier;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    @Qualifier("primaryServiceB")
    public ServiceB serviceB() {
        return new ServiceB();
    }

    @Bean
    @Qualifier("secondaryServiceB")
    public ServiceB secondaryServiceB() {
        return new ServiceB();
    }

    @Bean
    @Qualifier("serviceC")
    public ServiceC serviceC(@Qualifier("requestIdGenerator") RequestIdGenerator generator) {
        return new ServiceC(generator);
    }

    @Bean
    @Qualifier("requestIdGenerator")
    public RequestIdGenerator requestIdGenerator() {
        return new RequestIdGenerator();
    }
}