package sc.business;

public class Trail extends Park{
	
	private String difficulty;
	private String obstacleDescription;
	private String direction;
	private String comments;
	
	public Trail(){
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getObstacleDescription() {
		return obstacleDescription;
	}

	public void setObstacleDescription(String obstacleDescription) {
		this.obstacleDescription = obstacleDescription;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	
	
}
