package sc.comment.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sc.business.Comments;
import sc.util.DButil;

public class CommentDB implements CommentDAO{
	
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
}
