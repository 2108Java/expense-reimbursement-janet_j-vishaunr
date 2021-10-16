package Repository;

import java.util.ArrayList;

import Models.Manager;
import Service.managerService;

public class managerServiceImpl implements managerService{
	managerDataBaseDAO data;
public managerServiceImpl(managerDataBaseDAO data) {
	this.data= data;
}

	public ArrayList <Manager> selectAccount(String first_name, String last_name) {
		return data.selectAccount(first_name,last_name);
	}


	public ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name) {
		return data.selectReimbursementStatus(first_name,  last_name);
	}

	
	public boolean createAccount(int id,String first_name, String last_name,String title,String email) {
	
		return data.createEmployee(id,first_name,  last_name,title, email);
	}

	
	public boolean createCredentials(String username, String password) {
	
		return data.createEmployeeCredentials( username,  password);
	}

	public ArrayList<Manager> selectAllAccount() {
		return data.selectAll();
	}

	public boolean createAccountReimbursement(int id) {
		return data.createEmployeeReimbursement(id);
	}

	
	public boolean forgotPassword(String password, int id) {
		return data.forgotPassword(password,id);
	}


	public boolean accountReset(String username, String password, int id) {
		return data.accountReset(username,password,id);
	}



	



	

	


}
