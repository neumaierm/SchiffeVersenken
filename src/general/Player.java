package general;

import general.Block.Property;
import general.Ship.Orientation;
import general.Ship.Type;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;


public class Player extends Observable implements Observer{
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
		ship.addObserver(this);
		myShips.add(ship);
	}
	
	public boolean isDefeated(){
		boolean defeated = true;
		for(Ship s : myShips){
			defeated &= s.isSunk();
		}
		if(defeated){
			setChanged();
			notifyObservers();
		}
		return defeated;
	}
	
	public void shoot(Block target){
		if(target.getProperty().equals(Property.SHIP)){
			//for (Ship s : )
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		isDefeated();
	}
}
