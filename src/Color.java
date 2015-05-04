// TODO write a comment
public enum Color
{
	//objects
	/**
	 * Two different colors for the pawns
	 * Red and white
	 */
	RED("R"),
	// TODO write a comment
	WHITE("W");
	
	//attributes
	// TODO write a comment
	// TODO initialize value in a private constructor
	private String name = "";
	
	//builder
	// TODO finish writing comment
	/**
	 * 
	 * @param name
	 */
	private Color (String name)
	{
		this.name = name;
	}
	
	// TODO finish writing comment
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
