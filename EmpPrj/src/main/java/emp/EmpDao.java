package emp;

import org.springframework.stereotype.Component;

@Component
public class EmpDao implements IEmpDao {

	@Override
	public String getEname(int empno) {
		// TODO Auto-generated method stub
		
		if(empno == 7902) {
			return "FORD";
		} else {
			return "Error";
		}
	}

}
