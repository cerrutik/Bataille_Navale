
/**
 * Create Board
 * @author Cerrutik
 *
 */
public class Board 
{
	//default values
/**
 * The default width and length of the board
 */
	public final static int DEFAULT_LENGTH = 10;
	public final static int DEFAULT_WIDTH = 10;
	
	//attributes

/**
 * The board has a length and a width, which can't change, representing the size
 */
	private final int width;
	private final int length;
	
	//builders
	/**
	 * The board is created with the default values
	 */
	
	public Board()
	{
		this.width = DEFAULT_WIDTH;
		this.length = DEFAULT_LENGTH;
	}
}		 	