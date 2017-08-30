package sc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sc.business.Trail;
import sc.factory.Factory;
import sc.trail.db.TrailDAO;

@WebServlet({"/PrintServlet"})
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LinkedList<Trail> trailsToPrint;
	Trail t;
	private static TrailDAO trailsDAO = null;
	
    public PrintServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in the do post");
		HttpSession session = null;
		session = request.getSession();
		String url = "/index.html";
		String addtrail = (String) request.getParameter("addtrail");
		trailsDAO=Factory.getTrailDAO();
		t = trailsDAO.getTrailByTrailName(addtrail);
		System.out.println("Trail is: " + t);
		
		if (trailsToPrint!=null){	
			trailsToPrint = (LinkedList<Trail>) session.getAttribute("trailsToPrint");
		}
		else 
			trailsToPrint = new LinkedList<>();
		
		trailsToPrint.add(t);
		session.setAttribute("trailsToPrint", trailsToPrint);
		request.setAttribute("trailsToPrint", trailsToPrint);
		
		url="/print.jsp";
		
		System.out.println("addtrail = " + addtrail);
		System.out.println("trailstopring = " + trailsToPrint);
		
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
