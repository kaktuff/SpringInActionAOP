package com.springinaction.springidol;

/**
 * доброволец, мысли которого будем читать
 * он будет о чем-то думать
 */
public class Volunteer implements Thinker{
    private String thoughts;


    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
