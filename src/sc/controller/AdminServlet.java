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

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in the Admin Servlet");
		String url = "/index.html";	
		String message = "";
		String name = (String) request.getParameter("name");
		String email = (String) request.getParameter("email");
		String comments = (String) request.getParameter("comments");
		CommentDAO commentsDAO = Factory.getCommentDAO();
		
			Comments c = new Comments(name, email, comments);
			commentsDAO.addComment(c);
			StringBuilder commentsb = new StringBuilder(comments);
				if (commentsb.length()<2){
					message = "No comments were entered.";
					url = "/comments.jsp";
				}
				else {
					url = "/thankYouComment.jsp";
				}
			System.out.println("In the if statement in Admin Servlet");
			
		getServletContext().getRequestDispatcher(url).forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
