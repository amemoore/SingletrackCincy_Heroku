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
		String userName = (String) request.getParameter("username");
		String email = (String) request.getParameter("email");
		
		String parkNamePark = (String) request.getParameter("parknameP");
		String area = (String) request.getParameter("areaP");
		String address = (String) request.getParameter("addressP");
		String other = (String) request.getParameter("otherP");
		String restrooms = (String) request.getParameter("restroomsP");
		String parkDistrict = (String) request.getParameter("parkdistrictP");
		
		String parkNameTrail = (String) request.getParameter("parknameT");
		String trailName = (String) request.getParameter("trailnameT");
		String trailLength = (String) request.getParameter("parknameT");
		String difficulty = (String) request.getParameter("parknameT");
		String terrain = (String) request.getParameter("parknameT");
		String features = (String) request.getParameter("parknameT");
		String direction = (String) request.getParameter("parknameT");
		String notes= (String) request.getParameter("parknameT");
		String message="";
		Park p;
		LinkedList<Park> parks=new LinkedList<>();
		Trail t;
		LinkedList<Trail> trails=new LinkedList<>();
		
		if (userName!=null && email!=null){
			if (userName.equals("AwesomeAdmin")&& (email.equals("awesomeadmin@gmail.com"))){
				message="You made it!";
				request.setAttribute("message", message);
				url="/admin.jsp";
			}
			else{
				//Message Here
				url="/index.html";
			}
		}
		else if((parkNamePark!=null || !parkNamePark.isEmpty()) && (area!=null ||!area.isEmpty())
				&& (address!=null || !address.isEmpty()) && (restrooms!=null || !restrooms.isEmpty())
				&& (parkDistrict!=null || !parkDistrict.isEmpty())){
			p = new Park(parkNamePark, area, address, other, restrooms, parkDistrict);
			parks.add(p);
			request.setAttribute("new park", p);
			url="/adminconfirmation.jsp";
		}
		else if((parkNameTrail!=null || !parkNameTrail.isEmpty()) && (trailName!=null ||!trailName.isEmpty())
				&& (trailLength!=null || !trailLength.isEmpty()) && (difficulty!=null || !difficulty.isEmpty())
				&& (terrain!=null || !terrain.isEmpty()) && (direction!=null || !direction.isEmpty())){
			t = new Trail(parkNameTrail, trailName, trailLength, difficulty, terrain, features, direction, notes);
			trails.add(t);
			request.setAttribute("new trail", t);
			url="/adminconfirmation.jsp";
		}
		else{
			//Message Here
			url="admin.jsp";
		}
		
		
		
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
