package fr.iutvalence.info.m2103.project.battleship;
/**
 * Start a new game, setting two players
 * @author cerrutik
 *
 */
public class Game 
{
	//attributes
	
	//builder
	/**
	 * Create a new game, using the builder from Player
	 * creating two new players
	 */
	public Game()
	{
		Player p1 = new Player(1);
		Player p2 = new Player(2);
	}
	//methods
	/**
	 * launch the game, creating two player, giving them a board and some ships
	 */

	public static void play()
	{
		Game newGame = new Game();
		
	}
}
