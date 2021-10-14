package mockitoRepositoryTest;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import Models.Manager;
import Repository.managerDataBaseDAOImpl;
public class managerFunctionTests {
	private  managerDataBaseDAOImpl selectUser;
	public void test() {
	selectUser = mock(managerDataBaseDAOImpl.class);
	when(selectUser.selectUser("Ned", " Cat")).thenReturn(true);
	
	when(selectUser.approveReimbursement(0, "denied")).thenReturn(false);
	
	when(selectUser.createEmployee("Jim", "Bo", "Manager", 11, "JimBo@gmail.com")).thenReturn(false);
	

	ArrayList<Manager>  mock = new ArrayList<Manager>();
	when(selectUser.selectAll()).thenReturn(mock);
	
	
	when(selectUser.selectAccount("sally", "parker")).thenReturn(mock);
	
	when(selectUser.selectReimbursementStatus("Gimli", "Dwarf")).thenReturn(mock);
	when(selectUser.createEmployeeCredentials("Username", " ")).thenReturn(true);
	
	
	}
}
