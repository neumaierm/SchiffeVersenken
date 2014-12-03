package general;

import java.awt.Point;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

import GUI.ButtonField;

public class Field extends JPanel{
	
	private final int rowSize = 10;
	private HashMap <Point, Block> blocks;
	private LinkedList<Ship> ships;
	private Player owner;
	ButtonField field;
	
	public Field() {
		blocks = new HashMap<>();
		ships = new LinkedList<>();
		for(int x = 1; x <= rowSize; x++){
			for(int y = 1; y <= rowSize; y++){
				Block block = new Block(x, y);
				blocks.put(new Point(x, y), block);
			}
		}
		/*
		 * Create new Field over ButtonField.java
		 */
		field = new ButtonField();
	}
	
	public LinkedList<Ship> getShips(){
		return ships;
	}
	
	public JPanel getField(){
		return field;
	}
	
	public void setOwner(Player player){
		this.owner = owner;
	}
	
	public Block getBlock(Point point){
		return blocks.get(point);
	}
	
	public HashMap<Point, Block> getBlocks(){
		return blocks;
	}
	public Block getBlock(int x,int y){
		Point point=new Point(x,y);
		return blocks.get(point);
	}
	
	public void getShot (Point p){
		blocks.get(p).setShot();
	}

	public Player getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}

}
