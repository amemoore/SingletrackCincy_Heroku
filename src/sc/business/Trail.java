package sc.business;

public class Trail extends Park{
	
	private String trailName;
	private String trailLength;
	private String difficulty;
	private String terrain;
	private String length;
	private String obstacles;
	private String direction;
	private String notes;
	
	public Trail(){
	}

	public Trail(String trailNameIn, String trailLengthIn, String difficultyIn, String terrainIn, String obstaclesIn, String directionIn) {
		trailName = trailNameIn;
		trailLength = trailLengthIn;
		difficulty = difficultyIn;
		terrain = terrainIn;
		obstacles = obstaclesIn;
		direction = directionIn;
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

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getObstacles() {
		return obstacles;
	}

	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
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
}
