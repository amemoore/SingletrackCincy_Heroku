package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sc.business.Park;
import sc.factory.Factory;
import sc.park.db.ParkDAO;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
//WIP -- Directing traffic through name, area, or trail type search boxes
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/index.html";	
	    ParkDAO parksDAO=Factory.getParkDAO();;
		
		String name = (String) request.getParameter("namedropdown");
		String area = (String) request.getParameter("areadropdown");
		
		if (name!=null){
			Park currentPark = parksDAO.getPark(name);	
			request.setAttribute("parks", currentPark);
			
			if (name.equals("Mitchell Memorial Forest")){
				url = "/mitchell.jsp";
			}
			else if (name.equals("England-Idlewild")){
				url = "/england.jsp";
			}
			else if (name.equals("Devou Park")){
				url = "/devou.jsp";
			} 
		}
		else if (area!=null){
			Park currentPark = parksDAO.getPark(area);	
			request.setAttribute("parks", currentPark);
			
			if (area.equals("NE")){
			}
			else if (area.equals("SE")){
			}
			else if (area.equals("NW")){
			} 
			else if (area.equals("SW")){
			} 
			url = "/area.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
