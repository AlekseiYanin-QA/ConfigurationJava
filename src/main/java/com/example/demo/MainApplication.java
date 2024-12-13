package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest // Аннотация для тестирования Spring Boot приложения
public class DemoApplicationTests {

    @Autowired
    private ServiceB serviceB;

    @Autowired
    private ServiceB secondaryServiceB;

    @Autowired
    private ServiceC serviceC;

    @Autowired
    private RequestIdGenerator requestIdGenerator;

    @Test
    public void contextLoads() { // Тестирует, что контекст загружается
        assertThat(serviceB).isNotNull(); // Проверяет, что первичный ServiceB создается
        assertThat(secondaryServiceB).isNotNull(); // Проверяет, что вторичный ServiceB создается
        assertThat(serviceC).isNotNull(); // Проверяет, что ServiceC создается
        assertThat(requestIdGenerator).isNotNull(); // Проверяет, что RequestIdGenerator создается
    }
}