package general;

import general.Block.Property;

import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

public class Ship extends Observable implements Observer{
	public enum Type{
		UBOOT, ZERSTOERER, KREUZER, SCHLACHTSCHIFF
	};

	public enum Orientation{
		HORIZONTALLY, VERTICALLY
	};
	
	private Orientation orientation;
	private Type type;
	private Block[] occupiedBlocks;
	private int length;
	private boolean sunk;
	
	public Ship(Type type, Block startingBlock, Orientation orientation, Field field){
		this.occupiedBlocks = new Block[length];
		this.orientation = orientation;
		this.sunk = false;
		this.type = type;
		this.length = type.ordinal() + 2;
		this.setup(field, startingBlock);
	}
	
	private void setup(Field field, Block startingBlock){
		int xTemp = startingBlock.getX();
		int yTemp = startingBlock.getY();
		Block occBlock;
		if(orientation.equals(Orientation.HORIZONTALLY)){		
			for(int i = 0; i < length; i++){
				occBlock = field.getBlock(new Point(xTemp + i, yTemp));
				occBlock.setProperty(Property.SHIP);
				occBlock.addObserver(this);
				occupiedBlocks[i] = occBlock;
			}
		}
		else{
			for (int i = 0; i < length; i++){
				occBlock = field.getBlock(new Point(xTemp, yTemp + i));
				occBlock.setProperty(Property.SHIP);
				occBlock.addObserver(this);
				occupiedBlocks[i] = occBlock;
			}
		}
		
	}
	
	public boolean isSunk(){
		for(Block b : occupiedBlocks){
			sunk &= b.isShot();
		}
		if(sunk){
			setChanged();
			notifyObservers();
		}
		return sunk;
	}
	
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		isSunk();
		
	}

}