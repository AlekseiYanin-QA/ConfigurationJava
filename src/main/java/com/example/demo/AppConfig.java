package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    // Основной бин ServiceB с областью видимости Singleton
    @Bean
    @Primary
    @Qualifier("singletonServiceB")
    @Scope("singleton") // Устанавливаем область видимости как Singleton
    public ServiceB singletonServiceB() {
        return new ServiceB();
    }

    // Вторичный бин ServiceB с областью видимости Prototype
    @Bean
    @Qualifier("prototypeServiceB")
    @Scope("prototype") // Устанавливаем область видимости как Prototype
    public ServiceB prototypeServiceB() {
        return new ServiceB();
    }

    // Бин RequestIdGenerator
    @Bean
    @Qualifier("requestIdGenerator")
    public RequestIdGenerator requestIdGenerator() {
        return new RequestIdGenerator();
    }
}