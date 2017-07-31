package sc.factory;

import sc.comment.db.CommentDAO;
import sc.comment.db.CommentDB;
import sc.park.db.ParkDAO;
import sc.park.db.ParkDB;
import sc.trail.db.TrailDAO;
import sc.trail.db.TrailDB;

public class Factory {
		public static ParkDAO getParkDAO(){
			ParkDAO parksDAO = new ParkDB();
				return parksDAO;
			}
		public static TrailDAO getTrailDAO(){
			TrailDAO trailsDAO = new TrailDB();
				return trailsDAO;
			}
		public static CommentDAO getCommentDAO(){
			CommentDAO commentsDAO = new CommentDB();
				return commentsDAO;
			}
}
