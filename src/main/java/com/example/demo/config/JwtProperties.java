package com.example.demo.config;

public class JwtProperties {

    private String secret;
    private Long expirationMs;

    public String getSecret() {
        return secret;
    }

    public Long getExpirationMs() {
        return expirationMs;
    }
}
