package DAOImpl;

import java.util.ArrayList;

import DAO.dataBaseDAO;
import Models.Employee;
import Service.employeeService;

public class employeeServiceImpl implements employeeService {

dataBaseDAO data;
public employeeServiceImpl(dataBaseDAO data) {
	this.data= data;
}
	public boolean logIn(String username, String password) {
		// TODO Auto-generated method stub
		return data.selectUser(username,password);
	}


	public ArrayList <Employee> viewAccount(String first_name, String last_name, int id) {
		// TODO Auto-generated method stub
		return data.selectAccount(first_name,last_name,id);
	}

	
	public boolean requestReimbursement(String first_name, String last_name, int id, String reimbursementType,boolean requestReimbursement) {
		// TODO Auto-generated method stub
		return data.updateAccount(first_name,  last_name,  id, reimbursementType,requestReimbursement);
	}

	public ArrayList <Employee> viewAllAccount(String first_name, String last_name, int id) {
		// TODO Auto-generated method stub
		return data.selectAll(first_name,last_name,id);
	}


	public boolean approveReimbursement(String first_name, String last_name, int id,  boolean approve) {
		// TODO Auto-generated method stub
		return data.updateAccountAgain(first_name,last_name,id,approve);
	}

}
