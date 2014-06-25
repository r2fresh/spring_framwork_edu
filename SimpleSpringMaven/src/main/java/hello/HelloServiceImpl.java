package hello;

public class HelloServiceImpl implements HelloService{
	@Override
	public String greeting(String name){
		return "Hello~ " + name;
	}
}
