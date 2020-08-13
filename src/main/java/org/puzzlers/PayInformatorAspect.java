package org.puzzlers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PayInformatorAspect {

    @Pointcut("execution(* org.puzzlers..*.*(..))")
    public void allPayMethods() {
    }

    @Before("allPayMethods()")
    public void sendMailToStudent() {
        System.out.println();
        System.out.println("Darslar 10-sentabrdan boshlanadi BEFORE");
    }

    @After("allPayMethods()")
    public void sendMailStudentAfter() {
        System.out.println("Darslar 10-sentabrdan boshlanadi AFTER");
        System.out.println();
    }
}
