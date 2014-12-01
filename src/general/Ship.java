package general;

import general.Block.Property;

import java.awt.Point;

public class Ship {
	public enum Type{
		SCHLACHTSCHIFF, KREUZER, ZERSTOERER,
		UBOOT
	};
	
	public enum Orientation{
		HORIZONTALLY, VERTICALLY
	};
	
	private Orientation orientation;
	private Type type;
	private Block[] occupiedBlocks;
	private int length;
	private boolean sunk;
	
	public Ship(int length, Block startingBlock, Orientation orientation, Field field){
		occupiedBlocks = new Block[length];
		this.length = length;
		this.orientation = orientation;
		sunk = false;
		switch(length){
			case 2: type = Type.UBOOT; break;
			case 3: type = Type.ZERSTOERER; break;
			case 4: type = Type.KREUZER; break;
			case 5: type = Type.SCHLACHTSCHIFF; break;
			default: throw(new IllegalArgumentException());
		}
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
				occupiedBlocks[i] = occBlock;
			}
		}
		else{
			for (int i = 0; i < length; i++){
				occBlock = field.getBlock(new Point(xTemp, yTemp + i));
				occBlock.setProperty(Property.SHIP);
				occupiedBlocks[i] = occBlock;
			}
		}
		
	}

}