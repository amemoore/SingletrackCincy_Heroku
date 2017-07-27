package sc.trail.db;

import java.util.LinkedList;
import sc.business.Trail;

public interface TrailReader {
	LinkedList<Trail> getTrailsByPark(String parkName);
	LinkedList<Trail> getTrailsByDifficulty(String difficultyLevel);
}
