package com.example.port4clondelgentejava11.security;

public class AuthResponse {
    private String email;
    private String accessToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String accessToken) {
        this.setEmail(email);
        this.setAccessToken(accessToken);
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    
}
