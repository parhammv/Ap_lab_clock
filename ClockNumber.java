package com.company;

public class ClockNumber {
    private int limit;
    private int currentNumber;

    public ClockNumber(int limit) {
        this.limit = limit;
        currentNumber = 0;
    }

    public void increment() {
        currentNumber++;
    }

    public void setCurrentNumber(int number){
        currentNumber = number;
    }

    public int getCurrentNumber(){
        return currentNumber;
    }

    public void print(){
        System.out.print(currentNumber);
    }

    public String NumberToString(){
        if(currentNumber<10)
            return "0"+String.valueOf(currentNumber);
        else
            return String.valueOf(currentNumber);
    }
}
