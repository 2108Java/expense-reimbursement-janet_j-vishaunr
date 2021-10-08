package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionFactory {
private static final String URL = "jdbc:postgresql://database-1.cfoyuvgrfr00.us-east-2.rds.amazonaws.com/postgres";
private static final String USERNAME1  = "postgres";
private static final String PASSWORD1 = "LuckyTao#14";


public Connection getConnection() throws SQLException {
	
	Connection myConnection= DriverManager.getConnection(URL, USERNAME1, PASSWORD1);
		
	return myConnection;
	
	
}
}