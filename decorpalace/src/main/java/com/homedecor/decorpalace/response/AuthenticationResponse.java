package com.homedecor.decorpalace.response;

public class AuthenticationResponse {
    private String token;

    public String getToken() {
        return token;
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }
}
