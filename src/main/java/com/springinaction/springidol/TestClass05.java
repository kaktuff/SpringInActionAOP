package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass05 {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-aop-05.xml");

        Performer eddie = (Performer)ctx.getBean("eddie");
        eddie.perform();

    }
}

