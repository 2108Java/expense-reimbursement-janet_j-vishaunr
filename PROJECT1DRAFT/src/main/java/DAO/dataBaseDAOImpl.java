package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Authentication;
import Models.Employee;

public class dataBaseDAOImpl implements dataBaseDAO {

	String server ="localhost";
String username1="postgres";
String password1 = "LuckyTao#14";
 String url = "jdbc:postgresql://database-1.cfoyuvgrfr00.us-east-2.rds.amazonaws.com/postgres";
//testing

	public boolean selectUser(String username, String password) {
		ArrayList<Authentication> array = new ArrayList<Authentication>();
		boolean success = false;
		try {
			Connection connection = DriverManager.getConnection(url, username1, password1);
			String sql = "select *\r\n"
					+ "from employeecredentials\r\n"
					+ "where username = ?\r\n"
					+ "and \"password\"  = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				array.add(new Authentication(rs.getString("username"),
						rs.getString("password")));
			}
			success =true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}


	public ArrayList <Employee> selectAccount(String first_name, String last_name,String title, int id) {
		ArrayList <Employee> array = new ArrayList <Employee>();
		//change to arrayList
		try {
			Connection connection = DriverManager.getConnection(url, username1, password1);
			String sql = "select *\r\n"
					+ "from employee e \r\n"
					+ "where first_name  =? and last_name  = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1,first_name);
			ps.setString(2, last_name);
			//ps.setString(3, title);
		//	ps.setInt(4, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				array.add(new Employee(rs.getString("first_name"),
						rs.getString("last_name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}

	
	public boolean updateAccount(String first_name, String last_name, int id, String reimbursementType,boolean requestReimbursement) {
		//Employee [] array = new Employee [10];
		try {
			Connection connection = DriverManager.getConnection(url, username1, password1);
			String sql = "update employee \r\n"
					+ "set reiumbursement_Type = ?, request_Reimbursement = ? \r\n"
					+ "where id =?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,reimbursementType );
			ps.setBoolean(2, requestReimbursement);
			ps.setInt(3, id);
			ps.execute();
			//works
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	
	public ArrayList <Employee> selectAll() {
		ArrayList<Employee> array = new ArrayList <Employee>();
		try {
			Connection connection = DriverManager.getConnection(url, username1, password1);
			String sql = "Select * From Employee";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				array.add(new Employee(rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("title"),
						rs.getInt("id")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}
	public boolean updateAccountAgain( int id, boolean approve) {
		try {
		Connection connection = DriverManager.getConnection(url, username1, password1);
		String sql = "Update  Employee Set approved = true  Where id=?; ";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}

}