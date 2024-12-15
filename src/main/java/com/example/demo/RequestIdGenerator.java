package com.example.demo;

import java.util.UUID;

public class RequestIdGenerator {
    public String generateRequestId() {
        return UUID.randomUUID().toString();
    }
}