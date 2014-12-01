package general;


public class Block {
	private int x;
	private int y;
	private Property property;
	public enum Property{
		WATER, SHIP
	};
		private boolean shot;
		
	public Block(int x,int y){
		this.x=x;
		this.y=y;
		this.property=Property.WATER;
	
	}
	public int getX(){
		return this.x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y=y;
	}
	public boolean getShot(){
		return this.shot;
	}
	public void setShot(){
		this.shot=shot;
		
	}
	public  Property click(Player player,boolean initialize){	
		if(intitialize){
			player.setShip(this);
			}
		else{
			player.shoot(this);
		}

		return this.property;
	}
		
}
