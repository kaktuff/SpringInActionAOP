package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/* это аспект, в котором нет советов,
* но, который внедряет в компонент реализацию интерфейса
* */

@Aspect
//нужно объявить этот класс компонентов в xml-клонфигурации, чтобы создался аспект на его основе
public class ContestantIntroducer {
    @DeclareParents(value = "com.springinaction.springidol.Performer+", defaultImpl = GraciousContestant.class)
    // статичное свойство, к которому определяется аннтоация @DeclareParents
    // определяет внедряемый интерфейс
    public static Contestant contestant;
}
