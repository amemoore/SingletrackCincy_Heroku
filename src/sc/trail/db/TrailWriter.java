package sc.trail.db;

import sc.business.Trail;

public interface TrailWriter {
	void deleteTrail(Trail t);
	void addTrail (Trail t);
}
