package Service;

import java.util.ArrayList;

import Models.Employee;
import Repository.dataBaseDAO;
import Repository.employeeService;

public class employeeServiceImpl implements employeeService {

dataBaseDAO data;
public employeeServiceImpl(dataBaseDAO data) {
	this.data= data;
}

	public ArrayList <Employee> selectAccount(String first_name, String last_name,String title,int id) {
		return data.selectAccount(first_name,last_name,title,  id);
	}

	
	public boolean requestReimbursement( String last_name, int id, String reimbursementType,boolean requestReimbursement) {
		return data.requestReimbursement( last_name,  id, reimbursementType,requestReimbursement);
	}

	public ArrayList <Employee> selectAllAccount() {
		return data.selectAll();
	}

	public ArrayList<Employee> viewReimbursementStatus(String first_name, String last_name,int id) {
		return data.selectReimbursementStatus(first_name,  last_name, id);
	}

	






}
