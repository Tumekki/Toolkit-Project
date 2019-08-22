package com.company;

public class TemperatureConverter extends Converter {


    public double toFahrenheit(double convertable){
        double result = (convertable * 9/5) + 32;
        return result;
    }


    public double toCelsius(double convertable){
        double result = (convertable - 32) * 5/9;
        return result;
    }
}
