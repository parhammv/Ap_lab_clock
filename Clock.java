package com.company;

public class Clock {
    ClockNumber sec = new ClockNumber(60);
    ClockNumber min = new ClockNumber(60);
    ClockNumber hour = new ClockNumber(24);

    public void print(){
        System.out.print(hour.NumberToString()+" : "+min.NumberToString()+" : "+sec.NumberToString());
    }
    public void run(int currentSec, int currentMin, int currentHour) throws InterruptedException {
       sec.setCurrentNumber(currentSec);
       min.setCurrentNumber(currentMin);
       hour.setCurrentNumber(currentHour);

       while(true){
           while(hour.getCurrentNumber()<=23){
               while (min.getCurrentNumber()<=59){
                   while (sec.getCurrentNumber()<=59){
                       this.print();
                       System.out.println();
                       sec.increment();
                       Thread.sleep(1000);
                   }
                   sec.setCurrentNumber(0);
                   min.increment();
               }
               min.setCurrentNumber(0);
               hour.increment();
           }
           hour.setCurrentNumber(0);
       }
    }
}