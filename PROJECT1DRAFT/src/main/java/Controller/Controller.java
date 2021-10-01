package Controller;

import DAO.dataBaseDAO;
import DAOImpl.dataBaseDAOImpl;
import DAOImpl.employeeServiceImpl;
import Service.employeeService;
import io.javalin.Javalin;

public class Controller {
	employeeService serve;
	public Controller(employeeService serve) {
		this.serve=serve;
	}
public static void main(String[] args) {
	Javalin app = Javalin.create().start(8452);
	
	dataBaseDAO data= new dataBaseDAOImpl();
	employeeService serve = new employeeServiceImpl(data);
	
	Controller menu = new Controller(serve);
	//must add dependecies
}
}
