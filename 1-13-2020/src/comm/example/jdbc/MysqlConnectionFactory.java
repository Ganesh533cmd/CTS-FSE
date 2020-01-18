package comm.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectionFactory {
	private  Connection connection;
	 static MysqlConnectionFactory myConnection;
	
	
	private MysqlConnectionFactory()
	{
		
	}
	
	
	public static MysqlConnectionFactory getMyConnectionObject()
	{
		if(myConnection==null)
			{
			return new MysqlConnectionFactory();
		}
		else {
			return myConnection;
		}
	}
	
	public  Connection getMyConnection() throws SQLException
	{
		
		//DriverManager.registerDriver(new org.h2.Driver());
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
		return connection;
	}



}
