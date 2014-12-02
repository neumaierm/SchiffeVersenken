package general;

import java.awt.Point;
import java.util.Observable;
import javax.swing.JButton;

public class Block extends Observable {
	// Needing the point just for convenient storing in field's hashmap
	private int x;
	private int y;
	private Point point;
	private Property property;

	public enum Property {
		WATER, SHIP
	};

	private boolean shot;
<<<<<<< HEAD

	public Block(int x, int y) {
		point = new Point(x, y);
=======
	
	/**
	 * Generates an empty block, thus being "water"
	 * @param x Coordinate
	 * @param y Coordinate
	 */
	public Block(int x,int y){
		point = new Point(x,y);
>>>>>>> 39af053b675ad2d2c70fd2bb4b57154cc081d65b
		this.x = x;
		this.y = y;
		this.property = Property.WATER;

	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public boolean isShot() {
		return this.shot;
	}
<<<<<<< HEAD

	public void setShot() {
=======
	
	/**
	 * Changes the shot status and notifies the ship, if belonging to one
	 */
	public void setShot(){
>>>>>>> 39af053b675ad2d2c70fd2bb4b57154cc081d65b
		setChanged();
		this.shot = true;
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

	public Property click(JButton button,int x,int y) {
		return null;
	}
}
