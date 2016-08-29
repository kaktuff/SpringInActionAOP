package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


/* Пример класса, который определн как Аспект
* класс м.б. по-прежнему использован как обычный java-класс, и в том числе,
* можно, например, определить компонент в xml-конфигурации
* */

@Aspect
public class AudienceAspect {
    // определение среза
    // Имя среза определяется именем метода, к которому применяется аннотация.
    // в данном случае это "performance()"
    // Фактическое тело метода performance()
    // не имеет значения и в действительности должно быть пустым. Сам
    // метод служит лишь точкой подключения аннотации @Pointcut.
    @Pointcut(
            "execution(* com.springinaction.springidol.Performer.perform(..))")
    public void performance(){}

    // перед выступлением(совет)
    // в скобках как параметр указано имя среза
    @Before("performance()")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }

    // перед выступлением(совет)
    @Before("performance()")
    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }

    // после успешного выступдления(совет)
    @AfterReturning("performance()")
    public void applaud() { // После выступления
        System.out.println("applaud: CLAP CLAP CLAP CLAP CLAP");
    }

    // После неудачного выступления(совет)
    @AfterThrowing("performance()")
    public void demandRefund() { //<co id="co_demandRefundAfterException"/>
        System.out.println("Boo! We want our money back!");
    }

    @Around("performance()")
    // метод для использования в аспекте И до И После(совет)
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