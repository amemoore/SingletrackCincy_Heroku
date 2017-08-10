package sc.park.db;

import java.util.LinkedList;

import sc.business.Park;

public interface ParkReader {
	Park getPark(String parkName);
	LinkedList<Park> getAllParks(String park);
}
