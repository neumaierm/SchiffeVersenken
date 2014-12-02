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
	
	private final Orientation orientation;
	private final Type type;
	private final Block[] occupiedBlocks;
	private final int length;
	private boolean sunk;
	
	/**
	 * @param type enum from Ship, determines length
	 * @param startingBlock the top- or left block 
	 * @param orientation enum from Ship, determines growth
	 * @param field the field containing startingBlock
	 */
	public Ship(Type type, Block startingBlock, Orientation orientation, Field field){
		/*
		 * Schlachtschiff = 5, Kreuzer = 4, Zerstoerer = 3, UBoot = 2
		 */
		this.length = type.ordinal() + 2;
		this.occupiedBlocks = new Block[length];
		this.orientation = orientation;
		this.sunk = false;
		this.type = type;
		this.setup(field, startingBlock);
	}
	/**
	 * Marks all relevant blocks' property as SHIP, adds them to occupiedBlocks and
	 * registers this ship as an obs for the specific block
	 * @param field see constructor
	 * @param startingBlock see constructor
	 */
	private void setup(Field field, Block startingBlock){
		int xTemp = startingBlock.getX();
		int yTemp = startingBlock.getY();
		Block occBlock;
		
		/*
		 * Occupying all blocks to the right of startingBlock
		 */
		if(orientation.equals(Orientation.HORIZONTALLY)){		
			for(int i = 0; i < length; i++){
				occBlock = field.getBlock(new Point(xTemp + i, yTemp));
				occBlock.setProperty(Property.SHIP);
				occBlock.addObserver(this);
				occupiedBlocks[i] = occBlock;
			}
		}
		/*
		 * Occupying all blocks below of startingBlock
		 */
		else{
			for (int i = 0; i < length; i++){
				occBlock = field.getBlock(new Point(xTemp, yTemp + i));
				occBlock.setProperty(Property.SHIP);
				occBlock.addObserver(this);
				occupiedBlocks[i] = occBlock;
			}
		}
		
	}
	/**
	 * Checks whether the ship was destroyed. If so, observers are notified (usually the
	 * owner)
	 * @return destruction status
	 */
	public boolean isSunk(){
		/*
		 * Check shot for all occupied blocks. If all were shot, the ship has sunk and obs will me notified
		 */
		boolean tempSunk = true;
		for(Block b : occupiedBlocks){
			tempSunk &= b.isShot();
			if(!tempSunk)break;
		}
		if(tempSunk){
			sunk = true;
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

	/**
	 * Called by a block after being shot
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		isSunk();		
	}

}