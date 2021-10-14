package authenticationTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jetbrains.annotations.TestOnly;

import org.mockito.Mock;

import Models.Authentication;
import Repository.authenticationImpl;
class myAuthenticationTest {
	

	@Mock
	private authenticationImpl authentication;
	@TestOnly
	public void test() {
		authentication = mock(authenticationImpl.class);
		when(authentication.employeeLogIn("bober", "a pass")).thenReturn(true);
		when(authentication.managerLogIn("aManager", "aPassword")).thenReturn(false);
	}

}
