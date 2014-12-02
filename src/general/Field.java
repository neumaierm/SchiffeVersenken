package general;

import java.awt.Point;
import java.util.HashMap;
import java.util.LinkedList;

public class Field {
	private final int rowSize = 10;
	private HashMap <Point, Block> blocks;
	private LinkedList<Ship> ships;
	
	public Field() {
		blocks = new HashMap<>();
		ships = new LinkedList<>();
		for(int x=1;x<=rowSize;x++){
			for(int y=1;y<=rowSize;y++){
				Block block=new Block(x,y);
				blocks.put(new Point(x,y),block);
			}
		}
	}
	
	public LinkedList<Ship> getShips(){
		return ships;
	}
	
	public Block getBlock(Point point){
		return blocks.get(point);
	}
	public Block getBlock(int x,int y){
		Point point=new Point(x,y);
		return blocks.get(point);
	}

}
