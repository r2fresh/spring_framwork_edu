package hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public void sayHello(String name){
		for(int i=0; i<10; ++i){
			System.out.println("Hello~~" + name);
		}
	}
	
	public void sayGoodbye(String name){
		System.out.println("bye bye~~" +name);
	}
}