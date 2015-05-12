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
	
	//builder
	/**
	 * the player is created with a number, a board and an amount of ships (list) set on the board
	 * 
	 * @param int  
	 */
	public Player(int num)
	{
		this.number = num;
		new Board();
		List<Ship> ShipList = new LinkedList<Ship>();
		ShipList.add(new Ship(ShipType.AIRCRAFT_CARRIER,position(0,0),true));
		ShipList.add(new Ship(ShipType.BATTLESHIP));
		ShipList.add(new Ship(ShipType.BATTLESHIP));
		ShipList.add(new Ship(ShipType.SUBMARINE));
		ShipList.add(new Ship(ShipType.SUBMARINE));
		ShipList.add(new Ship(ShipType.CRUISER));
		ShipList.add(new Ship(ShipType.CRUISER));
		ShipList.add(new Ship(ShipType.PATROL_BOAT));
		ShipList.add(new Ship(ShipType.PATROL_BOAT));
		ShipList.add(new Ship(ShipType.PATROL_BOAT));
		
	}
}
