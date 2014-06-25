package hello;

public class HelloPrinter {
	
	HelloService helloService;
	
//	public HelloPrinter(HelloService helloService){
//		this.helloService = helloService;
//	}
	
//	public void printGreeting(){
//		System.out.println(helloService.greeting("홍길동"));
//	}
	
	
	
	public void printGreeting(){
		System.out.println(helloService.greeting("홍길동"));
	}

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
}
