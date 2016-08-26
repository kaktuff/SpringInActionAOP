package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass03 {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-aop-03.xml");

        Performer eddie = (Performer)ctx.getBean("eddie");
        eddie.perform();

    }
}

