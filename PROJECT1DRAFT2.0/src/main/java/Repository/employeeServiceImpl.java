package Repository;

import java.util.ArrayList;

import Models.Employee;
import Service.employeeService;

public class employeeServiceImpl implements employeeService {

	employeeDataBaseDAO data;
public employeeServiceImpl(employeeDataBaseDAO data) {
	this.data= data;
}

	public ArrayList <Employee> selectAccount(String first_name, String last_name) {
		return data.selectAccount(first_name,last_name);
	}

	
	public boolean requestReimbursement( int id, String reimbursementType,int amount,String description) {
		return data.requestReimbursement(   id, reimbursementType,amount,description);
	}



	public ArrayList<Employee> selectReimbursementStatus(String first_name, String last_name,int id) {
		return data.selectReimbursementStatus(first_name,  last_name, id);
	}





	public boolean forgotPassword( String password,int id) {
		return data.forgotPassword( password,id);
	}

	@Override
	public boolean accountReset(String username, String password, int id) {
		
		return data.accountReset(username, password,id);
	}


	



	

	






}
