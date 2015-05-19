package fr.iutvalence.info.m2103.project.battleship;
/**
 * Start a new game, setting two players
 * @author cerrutik
 *
 */
public class Game 
{
	//attributes
	private Player p1;
	private Player p2;
	
	//builder
	/**
	 * Create two new players
	 * 
	 */
	public Game()
	{
		this.p1 = new Player();
		this.p2 = new Player();
	}
	
	//methods
	/**
	 * launch the game, each player choose a position to hit
	 * 
	 */

	public static void play()
	{
		new Game();
		while(true)
		{
			for Player
			{
				Player.choosePositionToHit(Position);
				
			}
			
		}
		
		
	}
}
