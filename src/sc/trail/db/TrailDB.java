package sc.trail.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import sc.business.Trail;
import sc.util.DButil;

public class TrailDB implements TrailDAO{
	LinkedList<Trail> trails = null;
	
	//Getting List of Trails (By Park) from DB
			@Override
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
			@Override
			public LinkedList<Trail> getTrailsByDifficulty(String difficultyLevel){
				trails = new LinkedList<>();
				Trail t;
				String sql = " SELECT * FROM trails "
							+ " where Difficulty = ? ";
				try (Connection connection = DButil.getConnection();
						PreparedStatement ps = connection.prepareStatement(sql)){
							ps.setString(1,  difficultyLevel); 
							ResultSet rs = ps.executeQuery();
		        	while (rs.next()){
		        		int parkId = rs.getInt(1);
		        		String trailName = rs.getString(2);
		                String trailLength = rs.getString(3);
						String difficulty = rs.getString(4);
						String terrain = rs.getString(5);
						String obstacles = rs.getString(6);
						String direction = rs.getString(7);
		                t = new Trail(trailName, trailLength, difficulty, terrain, obstacles, direction);
		                trails.add(t);
		        	}
		        } 
				catch (SQLException e) {
		            System.out.println(e);
		        }
				return trails;
			}
}
