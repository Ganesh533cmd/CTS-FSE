package comm.project.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static Connector connector;
	private Connection connection;
	public Connector() {
		super();
	}
	public static Connector getConnector() {
		if(connector==null) {
			connector=new Connector();
		}
		return connector;
	}
	public Connection getConnection() throws SQLException {
		
		connection=DriverManager.getConnection();
		return connection;
		}
}
