package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Создание ApplicationContext на основе конфигурации AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем экземпляры бинов
        ServiceB singletonServiceB1 = context.getBean("singletonServiceB", ServiceB.class);
        ServiceB singletonServiceB2 = context.getBean("singletonServiceB", ServiceB.class);

        ServiceB prototypeServiceB1 = context.getBean("prototypeServiceB", ServiceB.class);
        ServiceB prototypeServiceB2 = context.getBean("prototypeServiceB", ServiceB.class);

        // Выполняем методы, чтобы продемонстрировать их создание и работу
        singletonServiceB1.incrementCounter();
        singletonServiceB2.incrementCounter(); // Это не должно изменить счетчик

        prototypeServiceB1.incrementCounter();
        prototypeServiceB2.incrementCounter(); // Это должно показать другой счетчик

        System.out.println("Singleton ServiceB Counter: " + singletonServiceB1.getCounter());
        System.out.println("Prototype ServiceB Counter 1: " + prototypeServiceB1.getCounter());
        System.out.println("Prototype ServiceB Counter 2: " + prototypeServiceB2.getCounter());
    }
}