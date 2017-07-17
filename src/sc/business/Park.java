package sc.business;

public class Park {
	private String location;
	private String description;
	private String otherActivities;
	private boolean restroom;
	
	public Park(){
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOtherActivities() {
		return otherActivities;
	}

	public void setOtherActivities(String otherActivities) {
		this.otherActivities = otherActivities;
	}

	public boolean isRestroom() {
		return restroom;
	}

	public void setRestroom(boolean restroom) {
		this.restroom = restroom;
	}

	
	
}
