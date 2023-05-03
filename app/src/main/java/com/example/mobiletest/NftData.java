package com.example.mobiletest;

public class NftData {
    private int nftImg;
    private String title;


    public NftData(int nftImg, String title){
        this.nftImg = nftImg;
        this.title = title;

    }

    public int getNftImg(){return this.nftImg;}

    public String getTitle()
    {
        return this.title;
    }

}
