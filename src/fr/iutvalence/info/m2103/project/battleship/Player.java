package fr.iutvalence.info.m2103.project.battleship;

/**
 * 
 * @author cerrutik
 *
 */
public class Player 
{
	/**
	 * Informations about the player
	 */
	private PlayerInfo information;
	
	/**
	 * choose a position to hit in the other player's board
	 * @param position
	 */
	public void choosePositionToHit(Position position)
	{
		position.getVerticalPosition();
		position.getHorizontalPosition();
	}
}
