package sc.business;

public class Comments {

	private String name;
	private String email;
	private String comments;
	private String dateSubmitted;
	
	public Comments(){
	}
	
	public Comments(String nameIn, String emailIn, String commentsIn){
		name =  nameIn;
		email = emailIn;
		comments = commentsIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	
	
	
}
