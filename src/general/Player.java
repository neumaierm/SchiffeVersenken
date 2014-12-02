package general;

import general.Ship.Orientation;
import general.Ship.Type;

import java.util.LinkedList;

public class Player {
	private String name;
	private final Field ownField;
	private final Field enemyField;
	private LinkedList<Ship> myShips;
	
	
	public Player(Field ownField, Field enemyField){
		this.ownField = ownField;
		this.enemyField = enemyField;
		myShips = ownField.getShips();
	}
	
	public Player(Field ownField, Field enemyField, String name){
		this(ownField, enemyField);
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setShip(Block startingBlock){
		Type type = Type.SCHLACHTSCHIFF;//TODO get from GUI
		Orientation orientation = Orientation.HORIZONTALLY; //TODO get from GUI
		Ship ship = new Ship(type, startingBlock, orientation, ownField);
		myShips.add(ship);
	}
	
	public boolean isDefeated(){
		boolean defeated = true;
		for(Ship s : myShips){
			defeated &= s.isSunk();
		}
		return defeated;
	}
	
	public void shoot(Block target){
		//TODO do shooting here
	}
}
