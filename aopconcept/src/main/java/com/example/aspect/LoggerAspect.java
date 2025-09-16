package com.example.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method execution starts");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finsih = Instant.now();
        long timeElapsed = Duration.between(start, finsih).toMillis();
        logger.info("time used to execute is "+ timeElapsed);
        logger.info(joinPoint.getSignature().toString() +" method execution ended"); 
    }
    @Around("@annotation(com.example.interfaces.LogAspect)")
    public void LogWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method execution starts with the help of annotation");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finsih = Instant.now();
        long timeElapsed = Duration.between(start, finsih).toMillis();
        logger.info("time used to execute is "+ timeElapsed);
        logger.info(joinPoint.getSignature().toString() +" method execution ended with the help of annotation"); 
    }
    @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
    public void LogExeption(JoinPoint joinPoint, Exception ex){
        logger.log(Level.SEVERE, joinPoint.getSignature()+ "An exception from thr help of @AftrerThrowing which happened due to :" + ex.getMessage() );
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal){
        logger.log(Level.INFO, joinPoint.getSignature() + " Method sucessfully Processed from AfrerReturning with Status " + retVal.toString());

    }
}
