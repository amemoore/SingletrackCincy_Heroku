package sc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	    
	    private static Connection connection;
	    
	    private DButil() {}
	    
	    
	    
	    public static synchronized Connection getConnection()  {
	            
	    	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	
	    	try {
	                // set the db url, username, and password
	                String url = "jdbc:mysql://localhost:3306/stcincy";
	                String username = "stcincy_user";
	                String password = "ses79aOleme";
	                
	                // get and return connection
	                connection = DriverManager.getConnection(
	                        url, username, password);
	            	} 
	            catch (SQLException e) {
	                System.out.println(e);
	            	} 
	        return connection;
	    }
	    
	    public static synchronized void closeConnection()  {
	        if (connection != null) {
	            try {
	                connection.close();
	            } catch (SQLException e) {
	            	System.out.println(e);
	            } finally {
	                connection = null;                
	            }
	        }
	    }
	}
