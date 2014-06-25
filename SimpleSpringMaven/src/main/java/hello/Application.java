package hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void	main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloPrinter printer = context.getBean("helloPrinter", HelloPrinter.class);
		printer.printGreeting();
	}
	
}