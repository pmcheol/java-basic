package springinaction.chapter04;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* springinaction.chapter04.Performance.perform(..))")
    public void performancePerform() {
    }

    @Before("performancePerform()")
    public void takeSeats() {
        System.out.println("taking seats.");
    }

    @AfterReturning("performancePerform()")
    public void applause() {
        System.out.println("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("performancePerform()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }
}
