package kt.hello;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
	
	@Resource
	HelloDao helloDao;
	
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return helloDao.sayHello(name + "님~~~");
	}

	public String sayGoodbye() {
		// TODO Auto-generated method stub
		return helloDao.sayGoodbye();
	}

}
