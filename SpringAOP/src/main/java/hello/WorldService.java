package hello;

import org.springframework.stereotype.Service;

@Service
public class WorldService {
	public void sayHello(String name){
		for(int i=0; i<10; ++i){
			System.out.println(name + "world !ㅣ");
		}
	}
}
