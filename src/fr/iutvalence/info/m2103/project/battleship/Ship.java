package fr.iutvalence.info.m2103.project.battleship;
import java.util.List;
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
	
	/**
	 * x and y,position of the head of the ship 
	 */
	private int x;
	
	private int y;
	
	/**
	 * Position of the boat, vertical or not
	 */
	private boolean isVertical;
	
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
