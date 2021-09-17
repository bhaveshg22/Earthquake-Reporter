package com.example.eathquakereporter;

public class Earthquake {

//    private double mag;
    private String city,url;
    private long date ;
    private double mag;

    public  Earthquake(double magni, String location, long date,String url) {
        mag = magni;
        this.date = date;
        city=location;
        this.url=url;
    }

    public double getMag(){
        return mag;
    }

    public String getLocation() {
        return city;
    }

    public long getDate() {
        return date;
    }

    public String getUrl(){ return url; }
}
