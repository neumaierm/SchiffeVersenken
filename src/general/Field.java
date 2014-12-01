package general;

import java.awt.Container;
import java.awt.Point;
import java.util.HashMap;
import java.util.LinkedList;

public class Field extends Container{
	//private final int size = 100;
	private HashMap <Point, Block> blocks;
	private LinkedList<Ship> ships;
	
	public Field() {
		blocks = new HashMap<>();
		ships = new LinkedList<>();
	}
	
	public LinkedList<Ship> getShips(){
		return ships;
	}
	
	public Block getBlock(Point point){
		return blocks.get(point);
	}

}
