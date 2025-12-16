package com.weather.app.model;

public class WeatherResponse {

    public Location location;
    public Current current;

    public static class Location {
        public String name;
        public String country;
    }

    public static class Current {
        public double temp_c;
        public int humidity;
        public double wind_kph;
        public Condition condition;
    }

    public static class Condition {
        public String text;
        public String icon;
    }
}
