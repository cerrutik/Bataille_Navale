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
	/**
	 * the player is created with a number, two boards and an amount of ships 
	 */
	
	public Player(int num)
	{
		this.number = num;
		Board board1 = new Board();
		Board board2= new Board();
	}
}
