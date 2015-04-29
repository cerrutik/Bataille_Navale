
public enum Color
{
	//objects
	/**
	 * Two different colors for the pawns
	 * Red and white
	 */
	RED("R"),
	WHITE("W");
	
	//attributes
	/**
	 * 
	 */
	private String name = "";
	
	//builder
	/**
	 * 
	 * @param name
	 */
	private Color (String name)
	{
		this.name = name;
	}
	
	//method
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
}
