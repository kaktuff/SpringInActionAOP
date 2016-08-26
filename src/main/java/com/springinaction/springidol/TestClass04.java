package com.springinaction.springidol;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass04 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-aop-04.xml");

        Thinker volunteer = (Thinker)ctx.getBean("volunteer");
        volunteer.thinkOfSomething("B......");

//        Magician magician = (Magician)ctx.getBean("magician");
//        magician.getThoughts();
    }

}
