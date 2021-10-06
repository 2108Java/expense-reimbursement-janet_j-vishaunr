package Repository;

import Models.Employee;

import java.util.ArrayList;



public interface employeeService {
	
	
	public ArrayList <Employee> selectAccount(String first_name,String last_name,String title,int id);
	public boolean requestReimbursement(String last_name, int id, String reimbursementType,String requestReimbursement);		
	public ArrayList <Employee> selectAllAccount();
	public ArrayList<Employee> viewReimbursementStatus(String first_name, String last_name,int id);
	
	
}
