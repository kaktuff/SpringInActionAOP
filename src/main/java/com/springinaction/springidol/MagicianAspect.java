package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MagicianAspect implements MindReader{

    private String thoughts;

    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut(
            "execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){
    }

    // передача параметра в совет
    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts = thoughts;
        System.out.println(getThoughts());
    }

    public String getThoughts() {
        return thoughts;
    }
}
