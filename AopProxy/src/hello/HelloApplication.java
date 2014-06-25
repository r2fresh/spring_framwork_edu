package hello;

public class HelloApplication {
	
	public static void main(String[] args) {
		helloService service = new HelloServiceProxy();
		service.sayHello("Kildong");
		System.out.println("------------");
		service.sayGoodbye();
	}
}
