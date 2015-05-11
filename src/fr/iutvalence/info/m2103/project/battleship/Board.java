package fr.iutvalence.info.m2103.project.battleship;
/**
 * Create Board
 * @author Cerrutik
 *
 */
public class Board 
{
	//default values
/**
 * The default width and length of the board
 * the length and the width are equal and the default value is 10
 */
	public final static int DEFAULT_LENGTH = 10;
	
	public final static int DEFAULT_WIDTH = 10;
	
	//attributes

/**
 * The board has a length and a width, which can't change, representing the size
 */
	private final int width;
	
	// The width, horizontal size of the board (the number of columns)
	
	private final int length;
	
	// The length, the vertical size of the board
	//the number of raws of the board
	
	
	//builders
	
	/**
	 * Builder creating the board with the default values
	 */
	public Board()
	{
		this.width = DEFAULT_WIDTH;
		this.length = DEFAULT_LENGTH;
		this.createGrid();
	}


}		 	