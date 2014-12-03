package general;

import general.Ship.Orientation;
import general.Ship.Type;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


public class Player extends Observable implements Observer{
	private String name;
	private final Field ownField;
	private final Field enemyField;
	private LinkedList<Ship> myShips;
	private boolean active; 
	
	/**
	 * Defines a player object as owner of a field and it's ships.
	 * ownField and enemyField must be set vice versa for 2 players
	 * @param ownField the player's field
	 * @param enemyField the enemy player's field
	 */
	public Player(Field ownField, Field enemyField){
		this.ownField = ownField;
		this.enemyField = enemyField;
		myShips = ownField.getShips();
		active = false;
	}
	
	/**
	 * Defines a player object as owner of a field and it's ships.
	 * ownField and enemyField must be set vice versa for 2 players
	 * @param ownField the player's field
	 * @param enemyField the enemy player's field
	 * @param name the player's name
	 */
	public Player(Field ownField, Field enemyField, String name){
		this(ownField, enemyField);
		this.name = name;
	}
	
	public JPanel getOwnField(){
		return ownField;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	/**
	 * Adds a ship to this player's field.
	 * Registers the player as the ship's obs
	 * @param startingBlock
	 */
	public void setShip(Block startingBlock){
		Type type = Type.SCHLACHTSCHIFF;//TODO get from GUI
		Orientation orientation = Orientation.HORIZONTALLY; //TODO get from GUI
		Ship ship = new Ship(type, startingBlock, orientation, ownField);
		ship.addObserver(this);
		myShips.add(ship);
	}
	
	/**
	 * A player has lost when all his ships are destroyed.
	 * If so he notifies THE GAME
	 * @return true if defeated
	 */
	public boolean isDefeated(){
		boolean defeated = true;
		for(Ship s : myShips){
			defeated &= s.isSunk();
			if(!defeated) break;
		}
		if(defeated){
			setChanged();
			notifyObservers();
		}
		return defeated;
	}
	
	
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public void update(Observable o, Object arg) {
		isDefeated();
	}
}
