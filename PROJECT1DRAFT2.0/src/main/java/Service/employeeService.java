package Service;

import Models.Employee;

import java.util.ArrayList;



public interface employeeService {
	
	
	public ArrayList <Employee> selectAccount(String first_name,String last_name);
	public boolean requestReimbursement( int id, String reimbursementType,int amount,String description);		
	public ArrayList<Employee> selectReimbursementStatus(String first_name, String last_name,int id);
	public boolean createAccount(String first_name, String last_name,String title,int id,String email);
	public boolean createCredentials(String username, String password);
	//public boolean forgetPassword();
	// add the ability for when creating an account , generate a temp username and password
	
}
