package sc.business;

public class Park {
	private String parkName;
	private String area;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String other;
	private String restrooms;
	
	public Park(){
	}
	
	public Park(String parkNameIn, String areaIn, String addressIn, String cityIn, String stateIn, String zipIn, 
			String otherIn, String restroomsIn){
		parkName=parkNameIn;
		area = areaIn;
		address = addressIn;
		city = cityIn;
		state = stateIn;
		zip = zipIn;
		other = otherIn;
		restrooms = restroomsIn;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getRestrooms() {
		return restrooms;
	}

	public void setRestrooms(String restrooms) {
		this.restrooms = restrooms;
	}
}
