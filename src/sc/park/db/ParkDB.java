package sc.park.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sc.business.Park;
import sc.util.DButil;

public class ParkDB implements ParkDAO{
	
	//Getting park information from the db
		public Park getPark(String park){
			Park parks = new Park();
			String sql = " SELECT * FROM parks "
						+ " where ParkName = ? ";
			try (Connection connection = DButil.getConnection();
					PreparedStatement ps = connection.prepareStatement(sql)){
						ps.setString(1,  park); 
						ResultSet rs = ps.executeQuery();
	        	while (rs.next()){
	        		int parkId = rs.getInt(1);
	        		String parkName = rs.getString(2);
	                String area = rs.getString(3);
					String address = rs.getString(4);
					String city = rs.getString(5);
					String state = rs.getString(6);
					String zip = rs.getString(7);
					String other = rs.getString(8);
					String restrooms = rs.getString(9);
	                parks = new Park(parkName, area, address, city, state, zip, other, restrooms);
	        	}
	        } 
			catch (SQLException e) {
	            System.out.println(e);
	        }
			return parks;
		}

}
