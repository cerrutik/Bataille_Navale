// TODO move classes in a package (fr.iutvalence.info.m2103.project.navalbattle
/**
 * Create Board
 * @author Cerrutik
 *
 */
public class Board 
{
	//default values
	// TODO fix comment (just comment LENGTH)
/**
 * The default width and length of the board
 */
	public final static int DEFAULT_LENGTH = 10;
	
	// TODO write a comment
	public final static int DEFAULT_WIDTH = 10;
	
	//attributes

	// TODO fix comment (just comment LENGTH)
/**
 * The board has a length and a width, which can't change, representing the size
 */
	private final int width;
	
	// TODO write a comment
	private final int length;
	
	// TODO write a comment
	
	private int[][] board;
	//builders
	
	// TODO detail comment
	/**
	 * The board is created with the default values
	 */
	public Board()
	{
		this.width = DEFAULT_WIDTH;
		this.length = DEFAULT_LENGTH;
	}
}		 	