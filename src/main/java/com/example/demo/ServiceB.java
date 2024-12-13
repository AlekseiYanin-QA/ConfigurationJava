package com.example.demo;

import org.springframework.context.annotation.Scope;

@org.springframework.stereotype.Service
@Scope("prototype")
public class Service {
    private int counter = 0;

    public void incrementCounter() {
        counter++;
        System.out.println("ServiceB: Counter is now " + counter);
    }
    public int getCounter() {
        return counter;
    }
}
