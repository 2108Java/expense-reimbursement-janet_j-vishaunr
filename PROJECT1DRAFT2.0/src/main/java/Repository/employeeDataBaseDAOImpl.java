package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import Models.Authentication;
import Models.Employee;
import Util.connectionFactory;
public class employeeDataBaseDAOImpl implements employeeDataBaseDAO {
	Logger loggy = Logger.getLogger(employeeDataBaseDAOImpl.class);
connectionFactory conFact = new connectionFactory();
	public boolean selectUser(String username, String password) {
		ArrayList<Authentication> array = new ArrayList<Authentication>();
		boolean success = false;
		try {
			Connection connection = conFact.getConnection();
			String sql = "select *\r\n"
					+ "from employeecredentials\r\n"
					+ "where username = ?\r\n"
					+ "and \"password\"  = ?;";
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				array.add(new Authentication(rs.getString("username"),
						rs.getString("password")));
			}
			success =true;
			
			loggy.info("Employee is authenticated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}


	public ArrayList <Employee> selectAccount(String first_name, String last_name) {
		ArrayList <Employee> array = new ArrayList <Employee>();
		try {
			Connection connection = conFact.getConnection();
			String sql = "select *\r\n"
					+ "from employee e \r\n"
					+ "where first_name  =? and last_name  = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1,first_name);
			ps.setString(2, last_name);
		
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				array.add(new Employee(rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("title"),
						rs.getInt("id")));
				loggy.info("Employee Selected specific account");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}

	
	public boolean requestReimbursement( int id, String reimbursementType,int amount,String description) {
		boolean success  = false;

		try {
			Connection connection = conFact.getConnection();
			String sql = "update reimbursement \r\n"
					+ " set request_Reimbursement = ?, reimbursement_Type = ? \r\n,amount = ? \\r\\n,description = ? \\r\\n"
					+ "where fk2_id = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
	
		
			ps.setString(1,reimbursementType);
			ps.setInt(2, amount);
			ps.setString(3,description);
			ps.setInt(4, id);
			ps.execute();
			success = true;
			loggy.info("Employee requested a reimbursement");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return success;
	}

	

	public ArrayList<Employee> selectReimbursementStatus(String first_name,String last_name, int id) {
	
		ArrayList<Employee> array = new ArrayList <Employee>();
		try {
			Connection connection = conFact.getConnection();
			String sql = "Select reimbursement_type, approved From reimbursement where R_id =?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				array.add(new Employee(rs.getString("request_Reimbursement"),
						rs.getString("reimbursement_Type"),
						rs.getString("Approved"),
						rs.getInt("R_id")));
				loggy.info("Employee viewed reimbursement status");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return array;
	}



	@Override
	public boolean createEmployee(String first_name, String last_name,String title,int id,String email) {
		boolean success = false;
		try {
			Connection connection = conFact.getConnection();
			String sql= "Insert into Employee values(?,?,?,?,?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setString(3, title);
			ps.setInt(4, id);
			ps.setString(5, email);
			ps.execute();
			 success = true;
			loggy.warn("A new Employee account was created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return success;
	}


	@Override
	public boolean createEmployeeCredentials(String username, String password) {
		boolean success = false;

		try {
			Connection connection = conFact.getConnection();
			String sql= "Insert into employeeCredentials values(?,?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, "temp");
			
			ps.execute();
			 success = true;
			 loggy.warn("Employee credentials were created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}







}
