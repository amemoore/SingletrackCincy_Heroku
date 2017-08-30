package sc.controller;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.business.Park;
import sc.business.Trail;
import sc.factory.Factory;
import sc.trail.db.TrailDAO;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/index.html";
		String message="";
		String userName = (String) request.getParameter("username");
		String email = (String) request.getParameter("email");
		String parkNameTrail = (String) request.getParameter("parknameT");
		String trailName = (String) request.getParameter("trailnameT");
		String trailLength = (String) request.getParameter("traillengthT");
		String difficulty = (String) request.getParameter("difficultyT");
		String terrain = (String) request.getParameter("terrainT");
		String features = (String) request.getParameter("featuresT");
		String direction = (String) request.getParameter("directionT");
		String notes= (String) request.getParameter("notesT");
		Trail t;
		LinkedList<Trail> trails=new LinkedList<>();
		TrailDAO trailsDAO=Factory.getTrailDAO();
		
		if (userName==null && email==null){
			
			if(parkNameTrail!=null && trailName!=null && trailLength!=null && difficulty!=null 
					&& terrain!=null && direction!=null){
				t = new Trail(parkNameTrail, trailName, trailLength, difficulty, terrain, features, direction, notes);
				trails.add(t);
				trailsDAO.addTrail(t);
				request.setAttribute("newtrail", t);
				message = "trail";
				request.setAttribute("message", message);
				url="/adminconfirmation.jsp";
			}
			else{
				message="Please fill out all required fields.";
				request.setAttribute("message", message);
				url="/admin.jsp";
			}
		}
		else if (userName.equals("AwesomeAdmin")&& (email.equals("awesomeadmin@gmail.com"))){
				request.setAttribute("message", message);
				url="/admin.jsp";
			}
		else{
				message="Invalid entry or incompleted fields.";
				url="/index.html";
			}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
}
