package jUnitTests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Repository.employeeDataBaseDAO;
import Repository.employeeDataBaseDAOImpl;
import Repository.employeeServiceImpl;
import Repository.managerDataBaseDAO;
import Repository.managerDataBaseDAOImpl;
import Repository.managerServiceImpl;
import Service.employeeService;
import Service.managerService;
import Models.Employee;
public class selectAccountsTests {

	employeeDataBaseDAO empData= new employeeDataBaseDAOImpl();
	employeeService newEmployeeService = new employeeServiceImpl(empData);
	managerDataBaseDAO newM= new managerDataBaseDAOImpl();
	managerService newManagerService = new managerServiceImpl(newM);
	ArrayList<Employee> mock = new ArrayList<Employee>();
	
	@Before

	public void why() {
		System.out.println("To check the ability to select accounts");
	}
	@Test 
public void selectAccountByEmployeeFirstLastName() {

	Assert.assertEquals(newEmployeeService.selectAccount("first_name", "last_name"), mock);
}
public void selectAllAccountsByManager() {
	Assert.assertEquals(newManagerService.selectAllAccount(), mock);

}
}

