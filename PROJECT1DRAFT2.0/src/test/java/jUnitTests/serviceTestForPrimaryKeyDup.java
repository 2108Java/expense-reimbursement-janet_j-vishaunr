package jUnitTests;

import java.sql.SQLException;
import java.util.ArrayList;

import org.jetbrains.annotations.TestOnly;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Repository.employeeDataBaseDAO;
import Repository.employeeDataBaseDAOImpl;
import Repository.employeeServiceImpl;
import Service.employeeService;



public class serviceTestForPrimaryKeyDup {
	employeeDataBaseDAO newData= new employeeDataBaseDAOImpl();
	employeeService newService = new employeeServiceImpl(newData);
	@Before
	public void whyTest() {
		System.out.println("Testing the creation of employee accounts with duplicate primary key");
	}
	
	@Test
	public void dummyCreateAccountToCheckForDuplicatePrimaryKeyConstraint() throws SQLException {
		
		
	}
	
	
}
