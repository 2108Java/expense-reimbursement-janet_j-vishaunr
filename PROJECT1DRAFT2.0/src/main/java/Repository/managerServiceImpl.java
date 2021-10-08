package Repository;

import java.util.ArrayList;

import Models.Manager;
import Service.managerService;

public class managerServiceImpl implements managerService{
	managerDataBaseDAO data;
public managerServiceImpl(managerDataBaseDAO data) {
	this.data= data;
}

	public ArrayList <Manager> selectAccount(String first_name, String last_name,int id) {
		return data.selectAccount(first_name,last_name,  id);
	}


	public ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name) {
		return data.selectReimbursementStatus(first_name,  last_name);
	}

	
	public boolean createAccount(String first_name, String last_name,String title,int id,String email) {
	
		return data.createEmployee(first_name,  last_name,title, id, email);
	}

	
	public boolean createCredentials(String username, String password) {
	
		return data.createEmployeeCredentials( username,  password);
	}

	public ArrayList<Manager> selectAllAccount() {
		return data.selectAll();
	}

	public boolean createAccountReimbursement(int id, String last_name) {
		return data.createEmployeeReimbursement(id, last_name);
	}


	



	

	


}
