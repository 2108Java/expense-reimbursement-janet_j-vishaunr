package Repository;

import java.util.ArrayList;

import Models.Employee;

public interface dataBaseDAO {

	boolean selectUser(String username, String password);

	ArrayList <Employee> selectAccount(String first_name, String last_name,String title,int id);

	boolean requestReimbursement( String last_name, int id, String reimbursementType,String requestReimbursement);

	ArrayList<Employee> selectAll();

	boolean managerApproveReimbursement( int id, boolean approve);

	ArrayList<Employee> selectReimbursementStatus(String first_name, String last_name,int id);

}
