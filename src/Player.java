/**
 * create a new player with an amount of ships
 * @author cerrutik
 *
 */
public class Player 
{
	//attributes
	/**
	 * the player has a number
	 */
	private final int number;
	
	//builder
	// TODO finish writing comment
	/**
	 * the player is created with a number, two boards and an amount of ships
	 * @param int  
	 */
	public Player(int num)
	{
		this.number = num;
		// TODO (think about it) these are local variables
		Board board1 = new Board();
		Board board2= new Board();
	}
}
