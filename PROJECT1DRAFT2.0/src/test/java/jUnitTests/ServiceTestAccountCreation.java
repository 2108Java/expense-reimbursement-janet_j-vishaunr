package jUnitTests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Models.Employee;
import Repository.employeeDataBaseDAO;
import Repository.employeeDataBaseDAOImpl;
import Repository.employeeServiceImpl;
import Repository.managerDataBaseDAO;
import Repository.managerDataBaseDAOImpl;
import Repository.managerServiceImpl;
import Service.employeeService;
import Service.managerService;

public class ServiceTestAccountCreation {
	ArrayList<Employee> myArray= new ArrayList<Employee>();
	managerDataBaseDAO newData= new managerDataBaseDAOImpl();
	managerService newManagerService = new managerServiceImpl(newData);
@Before	
public void whyTest() {
	System.out.println("Testing account creation for employee");
}
@Test
public void createAccountTest() {
	assertTrue(newManagerService.createAccount(1, "first_name", "last_name", "manager", "managerEmail"));
	
	
}
}
