package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.business.Comments;
import sc.comment.db.CommentDAO;
import sc.factory.Factory;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CommentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.html";	
		String name = (String) request.getParameter("name");
		String email = (String) request.getParameter("email");
		String comments = (String) request.getParameter("comments");
		
		//MAKE COMMENT OBJECT, ADD COMMENT TO THE DB, SEND TO THANKYOU PAGE
		CommentDAO commentsDAO = Factory.getCommentDAO();
		Comments c = new Comments(name, email, comments);
		commentsDAO.addComment(c);
		url = "/thankYouComment.jsp";
			
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
			
			
}
