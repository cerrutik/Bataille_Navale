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
	private final ShipType ship;
	
	/**
	 * Number of times this ship has been hit
	 */
	private int numberOfHits;
	
	//builder
	
	/**
	 * Create a ship with a name and a size
	 * @param ShipType 
	 */
	public Ship(ShipType shipName)
	{
		this.ship = shipName;
		shipName.getSize();
	}
}
