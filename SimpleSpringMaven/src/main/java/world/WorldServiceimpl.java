package world;

import org.springframework.stereotype.Service;

@Service(value="worldService")
public class WorldServiceimpl implements WorldService{
	
	@Override
	public String welcome(String name){
		return "Welcome ~ : " + name;
	}
}