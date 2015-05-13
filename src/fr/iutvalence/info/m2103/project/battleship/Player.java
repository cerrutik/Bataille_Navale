package fr.iutvalence.info.m2103.project.battleship;
import java.util.List;
import java.util.LinkedList;

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
	
	private List<Ship> shipList;
	
	
	//builder
	/**
	 * the player is created with a number, a board and an amount of ships (list) set on the board
	 * 
	 * @param int  
	 */
	public Player(int num)
	{
		this.number = num;
		this.boatBoard = new Board();
		this.attackBoard = new Board();
		
		this.shipList = new LinkedList<Ship>();
		shipList.add(new Ship(ShipType.AIRCRAFT_CARRIER,true));
		shipList.add(new Ship(ShipType.BATTLESHIP));
		shipList.add(new Ship(ShipType.BATTLESHIP));
		shipList.add(new Ship(ShipType.SUBMARINE));
		shipList.add(new Ship(ShipType.SUBMARINE));
		shipList.add(new Ship(ShipType.CRUISER));
		shipList.add(new Ship(ShipType.CRUISER));
		shipList.add(new Ship(ShipType.PATROL_BOAT));
		shipList.add(new Ship(ShipType.PATROL_BOAT));
		shipList.add(new Ship(ShipType.PATROL_BOAT));
		
	}
}
