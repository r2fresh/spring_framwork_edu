package emp;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class EmpPrinter {
	
	@Resource
	EmpService empService;
	
	public void printEmp(int empno){
		System.out.println(empService.getEname(empno));
	}
	
}
