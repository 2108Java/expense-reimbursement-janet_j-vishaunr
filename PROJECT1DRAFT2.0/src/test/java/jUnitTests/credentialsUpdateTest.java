package jUnitTests;

import Repository.managerDataBaseDAO;
import Repository.managerDataBaseDAOImpl;
import Repository.managerServiceImpl;
import Service.employeeService;
import Service.managerService;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Repository.employeeDataBaseDAO;
import Repository.employeeDataBaseDAOImpl;
import Repository.employeeServiceImpl;

public class credentialsUpdateTest {

employeeDataBaseDAO empData= new employeeDataBaseDAOImpl();
employeeService newService = new employeeServiceImpl(empData);
managerDataBaseDAO newM= new managerDataBaseDAOImpl();
managerService newManagerService = new managerServiceImpl(newM);	


@Before
public void why() {
	
	System.out.println("Checking if credentials work");
}
@Before
public void testCreateEmployeeAccount() {
	Assert.assertTrue(newManagerService.createAccount(6, "Tom", "Bombadil", "manOfMystery", "verySpooky@gmail.com"));
}


	@Test
public void testCreateEmployeeCredentials() {
		

		Assert.assertTrue(newManagerService.createCredentials("myNewUserName3", "myNewPassword3"));
		// there must be an employee to create credentials for
		// create a new employee account to test
	
	
	
	
}

}
