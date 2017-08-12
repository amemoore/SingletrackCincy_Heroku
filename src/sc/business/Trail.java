package sc.business;

public class Trail extends Park{
	private String parkName;
	private String trailName;
	private String trailLength;
	private String difficulty;
	private String terrain;
	private String features;
	private String direction;
	private String notes;
	
	public Trail(){
	}

	public Trail(String trailNameIn, String trailLengthIn, String difficultyIn, String terrainIn, 
			String featuresIn, String directionIn, String notesIn) {
		trailName = trailNameIn;
		trailLength = trailLengthIn;
		difficulty = difficultyIn;
		terrain = terrainIn;
		features = featuresIn;
		direction = directionIn;
		notes = notesIn;
	}
	public Trail(String parkNameIn, String trailNameIn, String trailLengthIn, String difficultyIn, 
			String terrainIn, String featuresIn, String directionIn, String notesIn) {
		parkName = parkNameIn;
		trailName = trailNameIn;
		trailLength = trailLengthIn;
		difficulty = difficultyIn;
		terrain = terrainIn;
		features = featuresIn;
		direction = directionIn;
		notes = notesIn;
	}
	
	public String getParkName() {
		return parkName;
	}

	public String getTrailName() {
		return trailName;
	}
	
	public void setTrailName(String trailName) {
		this.trailName = trailName;
	}

	public String getTrailLength() {
		return trailLength;
	}

	public void setTrailLength(String trailLength) {
		this.trailLength = trailLength;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getObstacles() {
		return features;
	}

	public void setObstacles(String features) {
		this.features = features;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}
