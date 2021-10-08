package Repository;

import Service.authenticationService;

public class authenticationImpl implements authenticationService {
	employeeDataBaseDAO data;
	public authenticationImpl(employeeDataBaseDAO data) {
		this.data= data;
	}
	public boolean logIn(String username, String password) {
		return data.selectUser(username,password);

	}

}
