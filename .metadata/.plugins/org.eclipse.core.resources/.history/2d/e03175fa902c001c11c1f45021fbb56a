package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import Models.Authentication;
import Models.Manager;
import Util.connectionFactory;
public class managerDataBaseDAOImpl implements managerDataBaseDAO{
	public final static Logger loggy = Logger.getLogger(managerDataBaseDAOImpl.class);

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
				success =true;
				loggy.info(" Manager authenticated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return success;
		
	}

	
	public ArrayList<Manager> selectAccount(String first_name, String last_name) {
		ArrayList <Manager> array = new ArrayList <Manager>();
	
		try {
			Connection connection = conFact.getConnection();
			String sql = "select *\r\n"
					+ "from employee e \r\n"
					+ "where first_name  =? and last_name  = ? and id=?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1,first_name);
			ps.setString(2, last_name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				array.add(new Manager(rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("title"),
						rs.getInt("id"),
						rs.getString("email")));
				loggy.info("Manager selected specific account by first and last name");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}

	public ArrayList<Manager> selectAll() {
		ArrayList<Manager> array = new ArrayList <Manager>();
		try {
			Connection connection = conFact.getConnection();
			String sql = "Select * From Employee";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				array.add(new Manager(rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("title"),
						rs.getInt("id"),
						rs.getString("email")));
				loggy.info("Manager select all accounts");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return array;
	}


	public boolean approveReimbursement(int id, String approve) {
		boolean success = false;
			try {
				Connection connection = conFact.getConnection();
			String sql = "update reimbursement \r\n"
					+ "set approval = ? ,approved_date_time= current_timestamp \r\n"
					+ "where reimbursement_id =?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, approve);
			ps.setInt(2, id);
			ps.execute();
			success = true;
			loggy.info("Manager sapproved remimbursement");

			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return success;

		}

	

	
	public ArrayList<Manager> selectReimbursementStatus(String first_name, String last_name) {
		ArrayList<Manager> array = new ArrayList <Manager>();
		try {
			Connection connection = conFact.getConnection();
			String sql = "Select reimbursement_type, approved From reimbursement where R_id =?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, first_name);
			ps.setString(1, last_name);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				array.add(new Manager(rs.getString("request_Reimbursement"),//pending,approved,denied
						rs.getString("reimbursement_Type"),
						rs.getBoolean("Approved"),
						rs.getInt("R_id")));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return array;
	}

	
	public boolean createEmployee(int id, String first_name, String last_name, String title, String email) {
		boolean success = false;
		try {
			Connection connection = conFact.getConnection();
			String sql= "Insert into Employee values(?,?,?,?,?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, first_name);
			ps.setString(3, last_name);
			ps.setString(4, title);
			ps.setString(5, email);
			ps.execute();
			 success = true;
			 loggy.warn("Created a new employee");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return success;
	}

	
	public boolean createEmployeeCredentials(String username, String password) {
		boolean success = false;

		try {
			Connection connection = conFact.getConnection();
			String sql= "Insert into employeeCredentials(username,password)  values(?,?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.execute();
			 success = true;
			 loggy.warn("Created employee crededntails");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	
	public boolean createEmployeeReimbursement(int id, String last_name) {
		boolean success = false;

		try {
			Connection connection = conFact.getConnection();
			String sql= "Insert into employeeCredentials(username,password) values(?,?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, last_name);
			ps.execute();
			 success = true;
			 loggy.warn("Created reimbursement row for employee");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}


}
