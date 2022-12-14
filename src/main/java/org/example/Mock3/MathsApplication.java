package org.example.Mock3;

public class MathsApplication {
    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    public double add(double input1, double input2){
        return calculatorService.add(input1,input2);
    }

    public double substract(double input1, double input2){
        return calculatorService.substract(input1,input2);
    }

    public double devide(double input1, double input2){
        return calculatorService.divide(input1,input2);
    }

    public double multiply(double input1, double input2){
        return calculatorService.multiply(input1,input2);
    }
}
