package fr.iutvalence.info.m2103.project.battleship;
public enum ShipType 
{
	//objects
	/**
	 * Name of the ship, and the size 
	 */
	AIRCRAFT_CARRIER(5),
	BATTLESHIP(4),
	SUBMARINE(3),
	CRUISER(3),
	PATROL_BOAT(2);
	
	//attributes

	/**
	 * Number of cases the ship takes
	 */
	private final int size;
	//builder
	
	/**
	 * Define the size of the ship
	 * @param size
	 */
	private ShipType(int size)
	{
		this.size = size;
	}
	
	//method
	/**
	 * Get the size of the ship
	 * @return size
	 */
	public int getSize()
	{
		return size;
	}
	
	
}
