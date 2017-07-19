package sc.park.db;

import sc.business.Park;

public interface ParkDAO extends ParkReader, ParkWriter {

	Park getPark(String parkName);
}
