package mockitoRepositoryTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import Models.Employee;

import Repository.employeeDataBaseDAOImpl;

public class employeeFunctionTest {
	
	private employeeDataBaseDAOImpl userSelect;
public void test() {
	userSelect  = mock(employeeDataBaseDAOImpl.class);
	
	
	when(userSelect.createEmployeeCredentials("myUserName"," temp" )).thenReturn(false);
	
	when(userSelect.requestReimbursement(1,"Lembas_bread",100 , "They're taking the hobbits to Isengard" ));
	ArrayList<Employee>  mock = new ArrayList<Employee>();

	when(userSelect.selectAccount("Gandalf","The-Gray")).thenReturn(mock);
	when(userSelect.selectReimbursementStatus("Bobby", "Son of Bob", 0)).thenReturn(mock);
	
	when(userSelect.selectUser("Sam_Wise", "Gamgee")).thenReturn(true);
}
}
