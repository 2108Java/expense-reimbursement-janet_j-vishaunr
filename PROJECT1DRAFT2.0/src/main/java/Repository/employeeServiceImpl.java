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

	@Override
	public boolean createAccount(String first_name, String last_name,String title,int id,String email) {
	
		return data.createEmployee(first_name,  last_name,title, id, email);
	}

	@Override
	public boolean createCredentials(String username, String password) {
	
		return data.createEmployeeCredentials( username,  password);
	}

	



	

	






}
