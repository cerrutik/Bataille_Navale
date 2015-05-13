package fr.iutvalence.info.m2103.project.battleship;
/**
 * The ship is a unit, there are different types of ships.
 * A ship is set on a board and can be hit.
 * If the boat is hit a couple of times (depending on the size of the boat), it is sunk.
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
	

	/**
	 * Table representing each part of the ship and telling if it is hit or not
	 */
	
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
	 * Create a ship with a type, a size, a number of hits set to 0, a new position
	 * and if the ship is vertical or not  
	 * @param ShipType, 
	 * @param position,
	 * @param vertical
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
	
	/**
	 * Change the value of hits
	 * @return
	 */
	public boolean[] getHits()
	{
		return this.hits;
	}
	
	/**
	 * Return false if the boat is sunk
	 * return true if the ship has a least one part not hit
	 * @return boolean
	 */
	public boolean isAlive()
	{
		int hit=0;
		 for(int i=0; i<this.shipType.getSize();i++)
			 if (this.hits[i] == true)
				 hit = hit + 1;
		if(hit == this.shipType.getSize())
			return false;
		return true;
		
		
	}
	
}
