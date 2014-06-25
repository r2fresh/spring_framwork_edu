package emp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmpService {
	
	@Resource
	IEmpDao empDao;
	
	@Override
	public String getEname(int empno) {
		// TODO Auto-generated method stub
		
		int temp = doIt(empno);
		return empDao.getEname(temp);

	}
	
	public int doIt(int empno){
		if(empno <= 0){
			empno = 1000;
		}
		
		return empno;
	}

}