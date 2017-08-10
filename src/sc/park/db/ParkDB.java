package sc.park.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import sc.business.Park;
import sc.business.Trail;
import sc.util.DButil;

public class ParkDB implements ParkDAO{
	
	LinkedList<Park> parks = null;
	Park p;

	//GETTING A PARK FROM DB
	public Park getPark(String park){
		Park parks = new Park();
		String sql = " SELECT * FROM parks "
				+ " where ParkName = ? ";
		try (Connection connection = DButil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1,  park); 
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				String parkName = rs.getString(2);
				String area = rs.getString(3);
				String address = rs.getString(4);
				String other = rs.getString(5);
				String restrooms = rs.getString(6);
				String parkDistrict  = rs.getString(7);
				parks = new Park(parkName, area, address, other, restrooms, parkDistrict);
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		return parks;
	}

	//GETTING ALL PARKS FROM DB
	public LinkedList<Park> getAllParks(String park){
		parks = new LinkedList<>();
		String sql = " SELECT * FROM parks ";
		try (Connection connection = DButil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				String parkName = rs.getString(2);
				String area = rs.getString(3);
				String address = rs.getString(4);
				String other = rs.getString(5);
				String restrooms = rs.getString(6);
				String parkDistrict  = rs.getString(7);
				p = new Park(parkName, area, address, other, restrooms, parkDistrict);
				parks.add(p);
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		return parks;
	}

	//FOR ADMIN TO ADD A PARK TO DB
	public void addPark(Park p) {
		String sql
		= "INSERT INTO parks (ParkName, Area, Address, Other, Restrooms, ParkDistrict) "
				+ " VALUES (?,?,?,?,?,?)";
		try ( Connection connection = DButil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(2, p.getParkName());
			ps.setString(3, p.getArea());
			ps.setString(4, p.getAddress());
			ps.setString(5, p.getOther());
			ps.setString(6, p.getRestrooms());
			ps.setString(7, p.getParkDistrict());
			ps.executeUpdate();
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	//FOR ADMIN TO DELETE A PARK FROM DB
	public void deleteTrail(Trail t) {
		String sql
	            = "DELETE FROM parks "
	            + " WHERE PARKNAME='?'  ";
	    try ( Connection connection = DButil.getConnection();
	    		PreparedStatement ps = connection.prepareStatement(sql)) {
	        ps.setString(2, p.getParkName());
	        ps.executeUpdate();
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}
}
