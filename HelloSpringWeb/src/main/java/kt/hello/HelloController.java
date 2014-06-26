package kt.hello;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@Resource
	HelloService helloService;
	
	@RequestMapping(value="/hello.do", method=RequestMethod.POST)
	public String hello(HttpServletRequest request,@RequestParam(value="username") String name){
		String result = helloService.sayHello(name);
		request.setAttribute("result", result);
		return "hello"; // WEB-INF/view/hello.jsp		
	}
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public String helloGet(HttpServletRequest request) {
		request.setAttribute("result", "GET방식을 지원하지 않아요");
		return "hello";
	}


	@RequestMapping("/go.do")
	public String go(@RequestParam String url){
		return url;
	}
}	