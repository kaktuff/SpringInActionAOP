package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass01 {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-aop-01.xml");

        Performer eddie = (Performer)ctx.getBean("eddie");
        eddie.perform();

        // так можно сделать, потому что мы обернули в интерфейс Performer в parent interface в Xml
        // по хорошему, это всё запускать в тестах, но я пока не умею
        Contestant eddieContestant = (Contestant)eddie;
        eddieContestant.receiveAward();
    }
}

