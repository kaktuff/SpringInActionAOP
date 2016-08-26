package com.springinaction.springidol;

public class Magician implements MindReader{

    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts = thoughts;
        System.out.println(getThoughts());
    }

    public String getThoughts() {
        return thoughts;
    }
}
