package springinaction.chapter04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
    @Pointcut("execution(* springinaction.chapter04.Performance.perform(..))")
    public void performancePerform() {
    }

    @Around("performancePerform()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            takeSeats();
            joinPoint.proceed();
            applause();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void takeSeats() {
        System.out.println("taking seats.");
    }

    public void applause() {
        System.out.println("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("performancePerform()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }
}
