package fr.iutvalence.info.m2103.project.battleship;
import java.util.List;
import java.util.LinkedList;

/**
 * All the informations about a player
 * (his number, board and ships)
 * @author cerrutik
 *
 */
public class PlayerInfo 
{
	//attributes
	/**
	 * the player has a number
	 */
	private final int number;
	
	private List<Ship> shipList;
	
	private Board board;
	
	
	//builder
	/**
	 * the player is created with a number, a board and an amount of ships (list) set on the board
	 * 
	 * @param int  
	 */
	public PlayerInfo(int num)
	{
		this.number = num;
		this.board = new Board();
		
		this.shipList = new LinkedList<Ship>();
		shipList.add(new Ship(ShipType.AIRCRAFT_CARRIER,new Position(1,2),true));
		shipList.add(new Ship(ShipType.BATTLESHIP,new Position(2,1),false));
		shipList.add(new Ship(ShipType.BATTLESHIP,new Position(3,3),true));
		shipList.add(new Ship(ShipType.SUBMARINE,new Position(1,7),false));
		shipList.add(new Ship(ShipType.SUBMARINE,new Position(4,5),false));
		shipList.add(new Ship(ShipType.CRUISER,new Position(10,6),true));
		shipList.add(new Ship(ShipType.CRUISER,new Position(10,1),true));
		shipList.add(new Ship(ShipType.PATROL_BOAT,new Position(5,9),false));
		shipList.add(new Ship(ShipType.PATROL_BOAT,new Position(8,9),true));
	}
	
}