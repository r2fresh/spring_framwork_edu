package emp;

import org.springframework.stereotype.Service;

@Service(value="empService")
public class EmpDao implements EmpService{
	
	@Override
	public String getEname(int empno){
		if(empno == 7807){
			return "FORD";
		} else {
			return "r2fresh";
		}
	}
}