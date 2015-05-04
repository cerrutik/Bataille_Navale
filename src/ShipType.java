
public enum ShipType 
{
	//objects
	// TODO write comment
	AIRCRAFT_CARRIER(5),
	// TODO write comment
	BATTLESHIP(4),
	// TODO write comment
	SUBMARINE(3),
	// TODO write comment
	CRUISER(3),
	// TODO write comment
	PATROL_BOAT(2);
	
	//attributes

	// TODO write comment
	private final int size;
	//builder
	
	// TODO write comment
	private ShipType(int size)
	{
		this.size = size;
	}
	
	//method
	// TODO write comment
	/**
	 * 
	 * @return
	 */
	public int getSize()
	{
		return size;
	}
	
	
}
