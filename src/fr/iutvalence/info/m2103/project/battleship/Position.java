package fr.iutvalence.info.m2103.project.battleship;
/**
 * Position of the head of the ship in the grid
 * two kind of position, the vertical position and the horizontal one
 * @author cerrutik
 *
 */
public class Position
{
	//attributes
	/**
	 * Two integers representing the position in the grid
	 */
	private final int verticalPosition;
	private final int horizontalPosition;
	
	//builder
	
	/**
	 * Set the position of the head of the ship 
	 * @param int vertical, int horizontal
	 */
	
	public Position (int vertical, int horizontal)
	{
		this.verticalPosition = vertical;
		this.horizontalPosition = horizontal;
	}

	public int getVerticalPosition() 
	{
		return verticalPosition;
	}

	public int getHorizontalPosition()
	{
		return horizontalPosition;
	}
	
}
