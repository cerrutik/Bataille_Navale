/**
 * The ship is a unit, there are different types of ships
 * @author cerrutik
 *
 */
public class Ship
{
	//attributes
	/**
	 * each ship has a name and a number of positions hit
	 */
	private final ShipType ship;
	private int NbPositionHit;
	
	//builder
	
	/**
	 * Create a ship 
	 * @param ShipType the ship will be given a name and a size
	 */
	public Ship(ShipType shipName)
	{
		this.ship = shipName;
		shipName.getSize();
	}
	

}
