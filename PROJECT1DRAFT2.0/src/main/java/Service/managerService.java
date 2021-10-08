package Service;

import java.util.ArrayList;

import Models.Manager;

public interface managerService {
	public ArrayList <Manager> selectAccount(String first_name,String last_name,int id);
	//public boolean requestReimbursement(String last_name, int id, String reimbursementType,String requestReimbursement);		
	public ArrayList <Manager> selectAllAccount();
	public ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name);
	public boolean createAccount(String first_name, String last_name,String title,int id,String email);
	public boolean createCredentials(String username, String password);
	public boolean  createAccountReimbursement(int id, String last_name);
}
