package com.example.OpenSky.Classes;

public class Token {
    private String token;
    private String expdate;
    private String expdateEpoch;

    public Token(String token, String expdate, String expdateEpoch){
        this.token = token;
        this.expdate = expdate;
        this.expdateEpoch = expdateEpoch;
    }
}
