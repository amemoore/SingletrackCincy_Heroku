package sc.park.db;

import sc.business.Park;
import sc.business.Trail;

public interface ParkWriter {
	void addPark(Park p);
	void deleteTrail(Trail t);
}
