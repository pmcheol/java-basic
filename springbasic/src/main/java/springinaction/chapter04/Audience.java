package springinaction.chapter04;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
    @Before("execution(** springinaction.chapter04.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("taking seats.");
    }

    @AfterReturning("execution(** springinaction.chapter04.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("execution(** springinaction.chapter04.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }
}
