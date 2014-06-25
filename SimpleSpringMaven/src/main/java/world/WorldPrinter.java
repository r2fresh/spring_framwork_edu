package world;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class WorldPrinter {
	
	@Resource(name="worldService")
	WorldService worldService;
	
	@Resource
	WorldService ktService;
	
	public void printWorld(){
		System.out.println(ktService.welcome("Kildong"));
	}
}
