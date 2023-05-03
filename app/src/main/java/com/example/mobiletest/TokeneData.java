package com.example.mobiletest;

public class TokeneData {
    private int token_img;
    private String enName;
    private String krName;

    public TokeneData(int token_img, String enName, String krName){
        this.token_img = token_img;
        this.enName = enName;
        this.krName = krName;
    }

    public int getToken_img(){return this.token_img;}

    public String getEnName()
    {
        return this.enName;
    }

    public String getKrName()
    {
        return this.enName;
    }
}
