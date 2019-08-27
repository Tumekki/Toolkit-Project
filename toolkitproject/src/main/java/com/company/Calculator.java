package com.company;

public class Calculator {

    public Calculator(){
        calculation = "";
    }


    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String calculation;
    private String result;
}
