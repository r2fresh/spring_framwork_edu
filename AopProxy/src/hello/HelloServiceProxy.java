package hello;

public class HelloServiceProxy extends helloService {
	
	@Override
	public void sayHello(String name) {
		super.sayHello(name); // 핵심코드는 부모(타겟)의 포인트컷 메소
		util.Log.i(); // 공통코드와 삽입되는 장소는 어드바이
	}
}
