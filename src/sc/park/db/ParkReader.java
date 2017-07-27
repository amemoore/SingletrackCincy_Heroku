package sc.park.db;

import sc.business.Park;

public interface ParkReader {
	Park getPark(String parkName);
}
