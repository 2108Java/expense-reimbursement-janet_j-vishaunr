package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBC.dataBaseDAOImpl;
import Models.Employee;
import Repository.authenticationService;
import Repository.dataBaseDAO;
import Repository.employeeService;
import Repository.reimburseService;
import Service.authenticationImpl;
import Service.employeeServiceImpl;
import Service.reimburseServiceImpl;

public class Test {
	 employeeService serve;
	public Test(employeeService serve) {
		this.serve=serve;
	}
	reimburseService reim_serve;
	public Test (reimburseService reim_serve) {
		this.reim_serve= reim_serve;
	}
	
	public static ArrayList prettyDisplay(ArrayList<Employee> arrayList){
		for(int i =0;i<arrayList.size();i++) {
			if(arrayList.get(i)!= null) {
			System.out.println(arrayList.get(i));
			}
		}
		return arrayList;
		///////needed a toString :///
	}
public static void main(String[] args) {
	//Javalin app = Javalin.create().start(8452);
	
	dataBaseDAO data= new dataBaseDAOImpl();
	employeeService serve = new employeeServiceImpl(data);
	reimburseService reim_serve = new reimburseServiceImpl(data);
	Test menu = new Test(serve);
	Test menu1 = new Test(reim_serve);

	//just for testing!!!!
	//employeeService empService = new employeeServiceImpl(data);
	
	//empService.viewAccount("Tom", "Albert");
	//prettyDisplay(menu.serve.viewAccount("Tom", "Albert","Cashier",1));
	//prettyDisplay(menu.serve.viewAllAccount());//works
	
	//Scanner scan = new Scanner(System.in);
	//user:bober
	//:pass:pass
	//String user = scan.nextLine();
	//String pass= scan.nextLine();
	//	authenticationService auth = new authenticationImpl(data);
	//	if(auth.logIn(user, pass)==true) {
			
			//System.out.println("something went through");
		//}else {
//	System.out.println("did not go through");
	//	}
	menu.serve.requestReimbursement( "Albert", 1, "Food", true);
	//menu1.reim_serve.managerApproveReimbursement(1, true);// works
	//menu.serve.viewReimbursementStatus("", "",  1);
}


}
		


