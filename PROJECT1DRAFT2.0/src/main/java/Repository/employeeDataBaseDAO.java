package Repository;

import java.util.ArrayList;

import Models.Employee;

public interface employeeDataBaseDAO {

	boolean selectUser(String username, String password);

	ArrayList <Employee> selectAccount(String first_name, String last_name);

	boolean requestReimbursement( int id, String reimbursementType,int amount,String description);

	//ArrayList<Employee> selectAll();

	//boolean managerApproveReimbursement( int id, boolean approve);

	ArrayList<Employee> selectReimbursementStatus(String first_name, String last_name,int id);

	boolean createEmployee(String first_name, String last_name,String title,int id,String email);

	boolean createEmployeeCredentials(String username, String password);

	//boolean createEmployeeReimbursement(int id, String last_name);

}
