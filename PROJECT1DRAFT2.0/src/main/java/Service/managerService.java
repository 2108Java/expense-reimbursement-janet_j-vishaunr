package Service;

import java.util.ArrayList;

import Models.Manager;

public interface managerService {
	public ArrayList <Manager> selectAccount(String first_name,String last_name);
	public ArrayList <Manager> selectAllAccount();
	public ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name);
	public boolean createAccount(int id,String first_name, String last_name,String title,String email);
	public boolean createCredentials(String username, String password);
	public boolean  createAccountReimbursement(int id);
	public boolean forgotPassword( String password,int id);
	public boolean accountReset(String username, String password,int id);

}
