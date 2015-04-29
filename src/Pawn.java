/**
 * Two type of pawns, represented by a color
 * each pawn represents either the hit or the miss 
 * @author cerrutik
 *
 */
public class Pawn
{
	//attributes
	/**
	 * Two different color, red and white
	 * red is for a hit and white for a miss
	 */
	private final Color pawnColor;
	
	//builder
	/**
	 * create a new pawn
	 * @param col
	 */
	public Pawn(Color col)
	{
		this.pawnColor = col;
		col.getName();
	}
}
