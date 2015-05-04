/**
 * The ship is a unit, there are different types of ships
 * @author cerrutik
 *
 */
public class Ship
{
	//attributes
	// TODO fix comment
	/**
	 * each ship has a name and a number of positions hit
	 */
	private final ShipType ship;
	
	// TODO write comment
	// TODO fix naming conventions
	private int NbPositionHit;
	
	//builder
	
	// TODO detail comment
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
