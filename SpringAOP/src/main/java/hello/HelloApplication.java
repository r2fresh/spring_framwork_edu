package hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		
		HelloService service = context.getBean("helloService", HelloService.class);
		
		service.sayHello("KilDong");
		service.sayGoodbye("KilDong");
		
		WorldService sservice = context.getBean("worldServic"
				+ "e", WorldService.class);
		
		sservice.sayHello("KilDong");

	}

}
