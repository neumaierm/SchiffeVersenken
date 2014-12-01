package general;

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
	
	private void setShip(Ship ship){
		myShips.add(ship);
	}
	
	public void shoot(Block target){
		//TODO do shooting here
	}
}
