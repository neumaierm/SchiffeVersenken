package general;

import java.awt.Point;


public class Block {
	//Needing the point just for convenient storing in field's hashmap
	private int x;
	private int y;
	private Point point;
	private Property property;
	public enum Property{
		WATER, SHIP
	};
	private boolean shot;
		
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
	
	public void setShot(){
		this.shot=true;
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

	/*public  Property click(Player player,boolean initialize){	
		if( true){
			player.setShip(this);
			}
		else{
			player.shoot(this);
		}

		return this.property;
	} */
}
