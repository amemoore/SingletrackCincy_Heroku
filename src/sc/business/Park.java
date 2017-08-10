package sc.business;

public class Park {
	private String parkName;
	private String area;
	private String address;
	private String other;
	private String restrooms;
	private String parkDistrict;
	
	public Park(){
	}
	
	public Park(String parkNameIn, String areaIn, String addressIn, 
			String otherIn, String restroomsIn, String parkDistrictIn){
		parkName=parkNameIn;
		area = areaIn;
		address = addressIn;
		other = otherIn;
		restrooms = restroomsIn;
		parkDistrict = parkDistrictIn;
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

	public String getParkDistrict() {
		// TODO Auto-generated method stub
		return null;
	}
}
