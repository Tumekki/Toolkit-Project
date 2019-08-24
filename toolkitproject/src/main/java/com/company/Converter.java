package com.company;

public class Converter {

    //Getter and setter for convertable
    public double getConvertable() {
        return convertable;
    }
    public void setConvertable(double convertable) {
        this.convertable = convertable;
    }

    public double toFahrenheit(double convertable){
        double result = (convertable * 9.0/5.0) + 32;
        return result;
    }

    public double toCelsius(double convertable){
        double result = (convertable - 32) * 5.0/9.0;
        return result;
    }



    private double convertable;



}
