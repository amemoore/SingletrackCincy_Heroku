<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.LinkedList, sc.business.Park, sc.business.Trail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="main.css">
	<title>Mitchell Memorial Forest</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<header>
		<div class="jspTop">
			
		</div>
	</header>

	<main>
	
		<div class="jspMain">
		
  			<div class="container text-center">
  				<div class="white">
    				<h3 >Mitchell Memorial Forest</h3>  
    			</div>   
    				<p class="text-left">Mitchell Memorial Forest is located on the west side of Cincinnati adjacent to the Great Miami River.  
						It is in close proximity to Miamitown and easy to reach from I-275 and I-74.  There are two mountain biking trails here.  
						Trail A feeds into Trail B for a total of 8.1 miles.  Great place for an after-work evening ride.  Mitchell Memorial 
						Forest is a part of Great Parks of Hamilton County, but the trails are maintained by CORA.  Check out their facebook
						page to see if the trails are clear to ride.</p>
					<div class="col-sm-4">
				    </div>	
				    <div class="col-sm-2">
				    	<a href="https://www.facebook.com/Mitchell-Memorial-Forest-Mountain-Bike-Trail-209920917752/"><img src="images/FacebookIconSquare.png" alt="Facebook" ></a>
				    </div>
				    <div class="col-sm-2">
				    	<a href="http://www.greatparks.org/parks/mitchell-memorial-forest" id="webBackground">Great Parks Website</a>
				    </div>
				    <div class="col-sm-4">
				    </div>
  			</div>
		
		
		
		
			<div class="container-fluid bg-3 text-center">  
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
					<div class="text-left">
						<h4 class="white"> Park Information</h4>
						<table align="center" class="jspTables">
									<%
										Park currentPark = (Park)request.getAttribute("parks");
									%>
									<tr><td class="tdthirty">Address: </td><td class="tdseventy"><%=currentPark.getAddress()%></td></tr>
									<tr><td class="tdthirty">Location: </td><td class="tdseventy"><%=currentPark.getArea()%></td></tr>
									<tr><td class="tdthirty">Restrooms: </td><td><%=currentPark.getRestrooms()%></td></tr>
						</table>
					</div>
				</div>
				<div class="col-sm-2"></div>
			</div>
		
			<div class="container-fluid bg-3 text-center">    
				 <div class="row">
				    <div class="col-sm-3">
				    </div>
				    
				    <div class="col-sm-6" > 
				    	<div class="text-left">
				    		
					    	<table align="center" class="jspTables">
								<% 
									LinkedList<Trail> currentTrails = (LinkedList<Trail>) request.getAttribute("trails");
										for (Trail t: currentTrails){
								%>
									<tr><th class="trailTitle"><%=t.getTrailName()%></th>
									<tr><td class="tdthirty">Difficulty: </td><td class="tdseventy"><%=t.getDifficulty()%></td></tr>
									<tr><td class="tdthirty">Trail Length: </td><td class="tdseventy"><%=t.getTrailLength()%></td></tr>
									<tr><td class="tdthirty">Terrain: </td><td class="tdseventy"><%=t.getTerrain()%></td></tr>
									<tr><td class="tdthirty">Features: </td><td class="tdseventy"><%=t.getFeatures()%></td></tr>
								<%
								} 
								%>
							</table>
						</div>
				    </div>
				    
				    <div class="col-sm-3">
				    </div>
				  </div>
				</div><br>
			
		<section class="jspBottom">
		
		
		
		</section>
	</main>

</body>
</html>