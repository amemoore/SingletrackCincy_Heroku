package sc.trail.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import sc.business.Comments;
import sc.business.Trail;
import sc.util.DButil;

public class TrailDB implements TrailDAO{
	LinkedList<Trail> trails = null;
	
	//Getting List of Trails (By Park) from DB
			public LinkedList<Trail> getTrailsByPark(String parkName){
				trails = new LinkedList<>();
				Trail t;
				String sql = " SELECT * FROM trails "
							+ " where ParkName = ? ";
				try (Connection connection = DButil.getConnection();
						PreparedStatement ps = connection.prepareStatement(sql)){
							ps.setString(1,  parkName); 
							ResultSet rs = ps.executeQuery();
		        	while (rs.next()){
		        		String trailName = rs.getString(3);
		                String trailLength = rs.getString(4);
						String difficulty = rs.getString(5);
						String terrain = rs.getString(6);
						String obstacles = rs.getString(7);
						String direction = rs.getString(8);
		                t = new Trail(trailName, trailLength, difficulty, terrain, obstacles, direction);
		                trails.add(t);
		        	}
		        } 
				catch (SQLException e) {
		            System.out.println(e);
		        }
				return trails;
			}
			
	//Getting List of Trails (By Difficulty Level) from DB
			public LinkedList<Trail> getTrailsByDifficultyLevel(String difficultyLevel){
				trails = new LinkedList<>();
				Trail t;
				String sql = " SELECT * FROM trails "
							+ " where Difficulty = ? ";
				try (Connection connection = DButil.getConnection();
						PreparedStatement ps = connection.prepareStatement(sql)){
							ps.setString(1,  difficultyLevel); 
							ResultSet rs = ps.executeQuery();
		        	while (rs.next()){
		        		String trailName = rs.getString(2);
		                String trailLength = rs.getString(3);
						String difficulty = rs.getString(4);
						String terrain = rs.getString(5);
						String length = rs.getString(6);
						String obstacles = rs.getString(7);
						String direction = rs.getString(8);
		                t = new Trail(trailName, trailLength, difficulty, terrain, obstacles, direction);
		                trails.add(t);
		        	}
		        } 
				catch (SQLException e) {
		            System.out.println(e);
		        }
				return trails;
			}
			
	//Getting List of Trails (By Area) from DB
			public LinkedList<Trail> getTrailsByArea(String area){
				trails = new LinkedList<>();
				Trail t;
				String sql = " SELECT * FROM trails "
							+ " where Difficulty = ? ";
				try (Connection connection = DButil.getConnection();
						PreparedStatement ps = connection.prepareStatement(sql)){
							ps.setString(1,  area); 
							ResultSet rs = ps.executeQuery();
		        	while (rs.next()){
		        		String trailName = rs.getString(2);
		                String trailLength = rs.getString(3);
						String difficulty = rs.getString(4);
						String terrain = rs.getString(5);
						String obstacles = rs.getString(7);
						String direction = rs.getString(8);
		                t = new Trail(trailName, trailLength, difficulty, terrain, obstacles, direction);
		                trails.add(t);
		        	}
		        } 
				catch (SQLException e) {
		            System.out.println(e);
		        }
				return trails;
			}
			
	//Getting List of All Trails from DB
			public LinkedList<Trail> getAllTrails(){
				trails = new LinkedList<>();
				Trail t;
				String sql = " SELECT * FROM trails ";
				try (Connection connection = DButil.getConnection();
						PreparedStatement ps = connection.prepareStatement(sql)){
							ResultSet rs = ps.executeQuery();
		        	while (rs.next()){
		        		String trailName = rs.getString(2);
		                String trailLength = rs.getString(3);
						String difficulty = rs.getString(4);
						String terrain = rs.getString(5);
						String length = rs.getString(6);
						String features = rs.getString(7);
						String direction = rs.getString(8);
		                t = new Trail(trailName, trailLength, difficulty, terrain, features, direction);
		                trails.add(t);
		        	}
		        } 
				catch (SQLException e) {
		            System.out.println(e);
		        }
				return trails;
			}
			
	//FOR ADMIN TO ADD A TRAIL TO DB
			public void addTrail(Trail t) {
				String sql
			            = "INSERT INTO trails (ParkName, TrailName, TrailLength, Difficulty, Terrain, Direction, Notes, Features) "
			            + " VALUES (?,?,?,?,?,?,?,?)";
			    try ( Connection connection = DButil.getConnection();
			    		PreparedStatement ps = connection.prepareStatement(sql)) {
			        ps.setString(2, t.getParkName());
			        ps.setString(3, t.getTrailName());
			        ps.setString(4, t.getTrailLength());
			        ps.setString(5, t.getDifficulty());
			        ps.setString(6, t.getTerrain());
			        ps.setString(7, t.getDirection());
			        ps.setString(8, t.getNotes());
			        ps.setString(9, t.getFeatures());
			        ps.executeUpdate();
			    } 
			    catch (SQLException e) {
			        System.out.println(e);
			    }
			}
			
	//FOR ADMIN TO DELETE A TRAIL FROM DB
			public void deleteTrail(Trail t) {
				String sql
			            = "DELETE FROM trails "
			            + " WHERE PARKNAME='?' AND TRAILNAME='?'' ";
			    try ( Connection connection = DButil.getConnection();
			    		PreparedStatement ps = connection.prepareStatement(sql)) {
			        ps.setString(2, t.getParkName());
			        ps.setString(3, t.getTrailName());
			        ps.executeUpdate();
			    } 
			    catch (SQLException e) {
			        System.out.println(e);
			    }
			}
}
