package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.dataBaseDAO;
import Models.Authentication;
import Models.Employee;

public class dataBaseDAOImpl implements dataBaseDAO {

	String server ="localhost";
String username="postgres";
String password = "PorkChop@00";
String url="database-1.cfoyuvgrfr00.us-east-2.rds.amazonaws.com";
//testing

	public boolean selectUser(String username, String password) {
		Authentication [] array = new Authentication [10];
		boolean success = false;
		try {
			Connection connection = DriverManager.getConnection(password, username, password);
			String sql = "Select first_name,last_name From Employee Where username =? and password =?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()) {
				array[i]= new Authentication(rs.getString("username"),
						rs.getString("password"));
			}
			success =true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}


	public ArrayList <Employee> selectAccount(String first_name, String last_name, int id) {
		ArrayList <Employee> array = new ArrayList <Employee>();
		//change to arrayList
		try {
			Connection connection = DriverManager.getConnection(password, username, password);
			String sql = "Select * From Employee Where first_name =? and last_name = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()) {
				array.add(new Employee(rs.getString(i),
						rs.getString(i),
						rs.getString(i),
						rs.getInt(i),
						rs.getString(i),
						rs.getBoolean(i),
						rs.getBoolean(sql)));
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
			Connection connection = DriverManager.getConnection(password, username, password);
			String sql = "Update table Employee Set reimbursementType =? ,requestReimbursement = ? Where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,reimbursementType );
			ps.setBoolean(2, requestReimbursement);
			ps.setInt(3, id);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	
	public ArrayList <Employee> selectAll(String first_name, String last_name, int id) {
		ArrayList<Employee> array = new ArrayList <Employee>();
		try {
			Connection connection = DriverManager.getConnection(password, username, password);
			String sql = "Select * From Employee";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()) {
				array.add(new Employee(rs.getString(i),
						rs.getString(i),
						rs.getString(i),
						rs.getInt(i)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}
	public boolean updateAccountAgain(String first_name, String last_name, int id, boolean approve) {
		try {
		Connection connection = DriverManager.getConnection(password, username, password);
		String sql = "Update table Employee Set approve = true where requestReimbursement = true; ";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
