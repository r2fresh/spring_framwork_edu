package emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		IEmpService empService = context.getBean("empService", IEmpService.class);
		System.out.println(empService.getEname(7902));
	}
	
}