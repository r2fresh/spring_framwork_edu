package kt.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloDao implements IHelloDao {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello~~~~ " + name;
	}

	public String sayGoodbye() {
		// TODO Auto-generated method stub
		return "Good bye...";
	}

}
