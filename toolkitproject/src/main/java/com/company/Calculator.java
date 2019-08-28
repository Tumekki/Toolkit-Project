package com.company;

public class Calculator {

    public Calculator(){
        calculation = "";
    }

    private String calculation;     //calculation stores the user's input in a string format
    private String result;          //result stores the result of the calculation in a string format
    private double num1;            //num1 holds the number on the left side of the operator
    private double num2;            //num2 holds the number on the right side of the operator
    private String operator;        //a flag variable that changes depending on which operator the user clicks
                                    //it's used by the calculate() function to do the right operations on the num1 & num2 variables

    //Takes in as parameters the numbers stored in num1 & num2 variables and operates on them depending on the
    //operator flag.
    public double calculate(double num1, double num2){
        switch(operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "%":
                return num1 / num2;
            default:
                return 0;
        }
    }

    //Getters and setters
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
