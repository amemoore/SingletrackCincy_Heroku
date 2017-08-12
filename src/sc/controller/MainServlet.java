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
import sc.park.db.ParkDAO;
import sc.trail.db.TrailDAO;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
    }
    
//DIRECTING TRAFFIC FROM PARK NAME, DIFFICULTY LEVEL, AND AREA DROPDOWN BOXES
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.html";	
	    ParkDAO parksDAO=Factory.getParkDAO();
	    TrailDAO trailsDAO=Factory.getTrailDAO();
		
		String nameDropDown = (String) request.getParameter("namedropdown");
		String areaDropDown = (String) request.getParameter("areadropdown");
		String difficultyDropDown = (String) request.getParameter("leveldropdown");
		
	//DIRECTING TO A PARK JSP
		if (nameDropDown!=null){
			//Getting Park by Name - Setting for JSP
				Park currentPark = parksDAO.getPark(nameDropDown);	
				request.setAttribute("parks", currentPark);
			//Getting All Trails for Park - Setting for JSP
				LinkedList<Trail> currentTrails = trailsDAO.getTrailsByPark(currentPark.getParkName());
				request.setAttribute("trails", currentTrails);
			
					if (nameDropDown.equals("Mitchell Memorial Forest")){
						url = "/mitchell.jsp";
					}
					else if (nameDropDown.equals("England-Idlewild")){
						url = "/england.jsp";
					}
					else if (nameDropDown.equals("Devou Park")){
						url = "/devou.jsp";
					} 
		}
	
	//DIRECTING TO A DIFFICULTY JSP
		else if (difficultyDropDown!=null){
			//Getting All Trails By Difficulty Level - Setting for JSP
				LinkedList<Trail> currentTrails = trailsDAO.getTrailsByDifficultyLevel(difficultyDropDown);
				request.setAttribute("trails", currentTrails);
					if (difficultyDropDown.equals("Easy")){
						url = "/easy.jsp";
					}
					else if (difficultyDropDown.equals("Intermediate")){
						url = "/intermediate.jsp";
					} 
					else if (difficultyDropDown.equals("Advanced")){
						url = "/advanced.jsp";
					} 
		}
		
	//DIRECTIN TO AN AREA JSP
		else if (areaDropDown!=null){
				if (areaDropDown.equals("NE")){
					url = "/ne.jsp";
				}
				else if (areaDropDown.equals("SE")){
					url = "/se.jsp";
				}
				else if (areaDropDown.equals("NW")){
					url = "/nw.jsp";
				} 
				else if (areaDropDown.equals("SW")){
					url = "/sw.jsp";
				} 
	}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
