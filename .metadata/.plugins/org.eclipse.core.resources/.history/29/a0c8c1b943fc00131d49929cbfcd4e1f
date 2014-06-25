package util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Pointcut("execution(public * * .getEname(*))")
	public void sayHelloPointcut(){}
	
	@Around("sayHelloPointcut()")
	public void trace(ProceedingJoinPoint joinPoint){
		long start = System.nanoTime();
		
		try{
			joinPoint.proceed();
		}catch(Throwable e){
			System.out.println(e.getMessage());
		}
		
		long end = System.nanoTime();
		System.out.println("메소드 실행 시간 : " + (end-start));

	};
}
