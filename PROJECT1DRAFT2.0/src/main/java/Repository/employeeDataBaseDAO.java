package Repository;

import java.util.ArrayList;

import Models.Employee;

public interface employeeDataBaseDAO {

	boolean selectUser(String username, String password);

	ArrayList <Employee> selectAccount(String first_name, String last_name);

	boolean requestReimbursement( int id, String reimbursementType,double amount,String description);

	ArrayList<Employee> selectReimbursementStatus(String first_name, String last_name,int id);

	boolean createEmployeeCredentials(String username, String password);
	boolean forgotPassword(String username, String password);

	;

}
