package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() { // После выступления
        System.out.println("applaud: CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }


    // метод для использования в аспекте И до И После
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            //System.out.println("The audience is taking their seats.");
            takeSeats();

            //System.out.println("The audience is turning off their cellphones");
            turnOffCellPhones();

            long start = System.currentTimeMillis(); // Перед выступлением
            joinpoint.proceed(); // Вызов целевого метода
            long end = System.currentTimeMillis(); // После выступления

            //System.out.println("CLAP CLAP CLAP CLAP CLAP");
            applaud();

            System.out.println("The performance took " + (end - start)  + " milliseconds.");

        } catch (Throwable t) {
            //System.out.println("Boo! We want our money back!");
            demandRefund();
        }
    }
}
