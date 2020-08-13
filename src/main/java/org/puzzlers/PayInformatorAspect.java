package org.puzzlers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PayInformatorAspect {
    @Pointcut("execution(* spring.puzzlers.*.pay*())")
    public void allPayMethods() {
        System.out.println("All payment methods");
    }

    @After("allPayMethods()")
    public void sendMailToStudent() {
        System.out.println("Darslar 10-sentabrdan boshlanadi");
    }
}
