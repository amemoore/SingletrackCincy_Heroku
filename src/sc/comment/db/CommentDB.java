package sc.comment.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import sc.business.Comments;
import sc.business.Park;
import sc.util.DButil;

public class CommentDB implements CommentDAO{
	
	LinkedList<Comments> comments = null;
	Comments c;
	
	//FOR USER TO LEAVE A COMMENT OR SUGGESTION
	public void addComment(Comments c) {
		System.out.println("in the CommentDB method");
		String sql
	            = "INSERT INTO comments (Name, Email, Comments) "
	            + " VALUES (?,?,?)";
	    try ( Connection connection = DButil.getConnection();
	    		PreparedStatement ps = connection.prepareStatement(sql)) {
	        ps.setString(1, c.getName());
	        ps.setString(2, c.getEmail());
	        ps.setString(3, c.getComments());
	        ps.executeUpdate();
	    } 
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}
	
	//FOR ADMIN TO DELETE A COMMENT
		public void deleteCommentById(Comments c) {
			String sql
		            = "DELETE FROM comments "
		            + " WHERE Id = '?' ";
		    try ( Connection connection = DButil.getConnection();
		    		PreparedStatement ps = connection.prepareStatement(sql)) {
		        ps.setInt(1, c.getId());
		        ps.executeUpdate();
		    } 
		    catch (SQLException e) {
		        System.out.println(e);
		    }
		}
		
		//GETTING ALL COMMENTS FROM DB
		public LinkedList<Comments> getAllComments(String comment){
			comments = new LinkedList<>();
			String sql = " SELECT * FROM comments "
					+ " Order By Id DESC ";
			try (Connection connection = DButil.getConnection();
					PreparedStatement ps = connection.prepareStatement(sql)){
				ResultSet rs = ps.executeQuery();
				while (rs.next()){
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String commentString = rs.getString(4);
					c = new Comments(name, email, commentString);
					comments.add(c);
				}
			} 
			catch (SQLException e) {
				System.out.println(e);
			}
			return comments;
		}
}
