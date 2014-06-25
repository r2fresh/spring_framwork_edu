package emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		
		EmpPrinter printer = context.getBean("empPrinter",EmpPrinter.class);
		
		printer.printEmp(7807);
	}
}

