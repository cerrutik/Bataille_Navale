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
 * The width, horizontal size of the board (the number of columns)
 */
	private final int width;
	
	
	
	/**
	 *  The length, the vertical size of the board
	 *  the number of raws of the board
	 */
	private final int length;
	
	/**
	 * Grid of the board, each case has a reference to a Ship
	 */
	
	private Ship[][] grid;
	
	//builders
	
	/**
	 * creates the board with the default values
	 */
	public Board()
	{
		this.width = DEFAULT_WIDTH;
		this.length = DEFAULT_LENGTH;
		this.createGrid();
	}

	/**
	 * Create a new grid for the board, initializing every case with 'null'
	 * @param 
	 */
	public void createGrid()
	{	
		int i;
		int j;
		for(i=0;i<this.width;i++)
		{
			for(j=0;j<this.length;j++)
			{
				this.grid[i][j] = null;
			}
		}
			
	}
	

}		 	