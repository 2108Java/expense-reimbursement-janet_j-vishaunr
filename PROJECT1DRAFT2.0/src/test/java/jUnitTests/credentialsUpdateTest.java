package jUnitTests;

import Repository.managerDataBaseDAO;
import Repository.managerDataBaseDAOImpl;
import Repository.managerServiceImpl;
import Service.employeeService;
import Service.managerService;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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


	@Test
public void Test() {


Assertions.assertTrue(newService.createCredentials("myNewUserName3", "myNewPassword3"));
	
	
	
	
}
}
