package com.example.quakereport;

public class Earthquake {
    //Private variables
    private double scale;
    private String city;
    private long time;
    private String url;

    //Constructer
    public Earthquake(double Scale, String City, long Time, String Url)
    {
        scale=Scale;
        city=City;
        time=Time;
        url=Url;
    }

    //public Get method

    public String getCity() {
        return city;
    }

    public String getTime() {
        return Long.toString(time);
    }

    public String getScale() {
        return Double.toString(scale);
    }

    public Object getUrl() {
        return url;
    }
}
