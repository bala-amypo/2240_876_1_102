package com.example.demo.config;

@ConfigurationProperties
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
