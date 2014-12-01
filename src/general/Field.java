package general;

import java.util.LinkedList;

public class Field {
	private final int size = 64;
	private Block[] myBlocks;
	private LinkedList<Ship> ships;
	
	public Field() {
		myBlocks = new Block[size];
		ships = new LinkedList<>();
	}
	
	public LinkedList<Ship> getShips(){
		return ships;
	}

}
