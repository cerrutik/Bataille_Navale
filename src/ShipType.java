
public enum ShipType 
{
	//objects
	/**
	 * A list of all the types of boats
	 */
	AIRCRAFT_CARRIER(5),
	BATTLESHIP(4),
	SUBMARINE(3),
	CRUISER(3),
	PATROL_BOAT(2);
	
	//attributes
	/**
	 * 
	 */
	private final int size;
	//builder
	/**
	 * 
	 * @param size
	 */
	private ShipType(int size)
	{
		this.size = size;
	}
	
	//method
	/**
	 * 
	 * @return
	 */
	public int getSize()
	{
		return size;
	}
	
	
}
