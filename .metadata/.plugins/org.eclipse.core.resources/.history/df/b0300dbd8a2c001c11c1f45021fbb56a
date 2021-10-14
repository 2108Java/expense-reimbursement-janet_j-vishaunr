package Service;

import Repository.authenticationService;
import Repository.dataBaseDAO;

public class authenticationImpl implements authenticationService {
	dataBaseDAO data;
	public authenticationImpl(dataBaseDAO data) {
		this.data= data;
	}
	public boolean logIn(String username, String password) {
		return data.selectUser(username,password);

	}

}
