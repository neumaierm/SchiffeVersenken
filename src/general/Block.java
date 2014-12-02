package general;

import java.awt.Point;
import java.util.Observable;

public class Block extends Observable{
	//Needing the point just for convenient storing in field's hashmap
	private int x;
	private int y;
	private Point point;
	private Property property;
	public enum Property{
		WATER, SHIP
	};
	private boolean shot;
	
	/**
	 * Generates an empty block, thus being "water"
	 * @param x Coordinate
	 * @param y Coordinate
	 */
	public Block(int x,int y){
		point = new Point(x,y);
		this.x = x;
		this.y = y;
		this.property=Property.WATER;
	
	}
		
	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public boolean isShot(){
		return this.shot;
	}
	
	/**
	 * Changes the shot status and notifies the ship, if belonging to one
	 */
	public void setShot(){
		setChanged();
		this.shot=true;
		notifyObservers();
	}

	public Point getPoint() {
		return point;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public  Property click(){	
		return null;
	} 
}
