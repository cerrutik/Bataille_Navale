package fr.iutvalence.info.m2103.project.battleship;
/**
 * The ship is a unit, there are different types of ships
 * a ship is set on a board and can be hit
 * if the boat is hit a couple of times (depending on the size of the boat), it is sunk
 * @author cerrutik
 *
 */
public class Ship
{
	//attributes
	/**
	 * Ship type
	 * 
	 */
	private final ShipType shipType;
	

	
	private boolean[] hits;
	/**
	 * position of the head of the ship 
	 */
	private final Position position;
	
	
	/**
	 * Position of the boat, vertical or not
	 */
	private boolean isVertical;
	
	//builder
	
	/**
	 * Create a ship with a name, a size, a number of hits set to 0, a new position
	 * and if the ship is vertical or not  
	 * @param ShipType shipName, int x, int y, boolean vertical
	 */
	public Ship(ShipType shipType, Position position, boolean vertical)
	{
		this.shipType = shipType;
		
		this.hits = new boolean[this.shipType.getSize()];
		for(int i=0; i<this.shipType.getSize(); i++)
			this.hits[i] = false;
		
		
		this.position = position;
		
		this.isVertical = vertical;
	}
	
	public boolean[] getHits(){
		return this.hits;
	}
	
	//TOUT DOUX
	public boolean isAlive(){
		 
	}
	
}
