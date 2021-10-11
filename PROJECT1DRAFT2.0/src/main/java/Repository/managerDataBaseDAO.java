package Repository;

import java.util.ArrayList;

import Models.Manager;

public interface managerDataBaseDAO {
	boolean selectUser(String username, String password);

	ArrayList <Manager> selectAccount(String first_name, String last_name);

	ArrayList<Manager> selectAll();

	boolean approveReimbursement( int id, String approve);

	ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name);

	boolean createEmployee(int id,String first_name, String last_name,String title,String email);

	boolean createEmployeeCredentials(String username, String password);

	boolean createEmployeeReimbursement(int id, String last_name);
}
