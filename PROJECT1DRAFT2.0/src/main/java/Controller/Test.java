package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import Models.Employee;
import Repository.authenticationImpl;
import Repository.employeeDataBaseDAO;
import Repository.employeeDataBaseDAOImpl;
import Repository.employeeServiceImpl;
import Repository.managerDataBaseDAO;
import Repository.managerDataBaseDAOImpl;
import Repository.reimburseServiceImpl;
import Service.authenticationService;
import Service.employeeService;
import Service.reimburseService;

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
	public final static Logger loggy = Logger.getLogger(Test.class);

public static void main(String[] args) {
	//Javalin app = Javalin.create().start(8452);
loggy.info("So it begins");
	employeeDataBaseDAO data= new employeeDataBaseDAOImpl();
	employeeService serve = new employeeServiceImpl(data);
	managerDataBaseDAO dataM= new managerDataBaseDAOImpl();
	reimburseService reim_serve = new reimburseServiceImpl(dataM);
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
	//menu.serve.requestReimbursement( "Albert", 1, "Food", " ");
	//menu1.reim_serve.managerApproveReimbursement(1, true);// works
	//menu.serve.viewReimbursementStatus("", "",  1);
	
	//menu.serve.createAccount("Morg","Tack","Employee",100,"Morg@yahoo.com");
	
	menu.serve.forgotPassword("Bobby", "Tibbs",1);
}


}
		


