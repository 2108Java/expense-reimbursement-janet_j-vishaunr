package Repository;

import Service.authenticationService;

public class authenticationImpl implements authenticationService {
	employeeDataBaseDAO data;
	public authenticationImpl(employeeDataBaseDAO data) {
		this.data= data;
	}
	managerDataBaseDAO dataM;
	public authenticationImpl(managerDataBaseDAO dataM) {
		this.dataM= dataM;
	}
	public boolean employeeLogIn(String username, String password) {
		return data.selectUser(username,password);

	}
	public boolean managerLogIn(String username, String password) {
		return dataM.selectUser(username,password);

	}

}
