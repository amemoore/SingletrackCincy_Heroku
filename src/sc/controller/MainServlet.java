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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In the Servlet - Do Get");
		
		String url = "/index.html";	
		String value = (String) request.getParameter("mydropdown");
		String parkName;
		Park parks;
		ParkDAO parksDAO = Factory.getParkDAO();
		Park currentPark = parksDAO.getPark(value);	
		request.setAttribute("parks", currentPark);
		
		if (value.equals("Mitchell Memorial Forest")){
			url = "/mitchell.jsp";
		}
		else if (value.equals("England-Idlewild")){
			url = "/england.jsp";
		}
		else if (value.equals("Devou Park")){
			url = "/devou.jsp";
		}
		
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
