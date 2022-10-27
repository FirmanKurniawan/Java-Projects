// To represent a cell of display board.
public class Cell {

	private final int row, col;
	private CellType cellType;

	public Cell(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	public CellType getCellType()
	{
		return cellType;
	}

	public void setCellType(CellType cellType)
	{
		this.cellType = cellType;
	}

	public int getRow()
	{
		return row;
	}

	public int getCol()
	{
		return col;
	}
}
// To represent a snake
import java.util.LinkedList;

public class Snake {

	private LinkedList<Cell> snakePartList
		= new LinkedList<>();
	private Cell head;

	public Snake(Cell initPos)
	{
		head = initPos;
		snakePartList.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}

	public void grow() { snakePartList.add(head); }

	public void move(Cell nextCell)
	{
		System.out.println("Snake is moving to "
						+ nextCell.getRow() + " "
						+ nextCell.getCol());
		Cell tail = snakePartList.removeLast();
		tail.setCellType(CellType.EMPTY);

		head = nextCell;
		head.setCellType(CellType.SNAKE_NODE);
		snakePartList.addFirst(head);
	}

	public boolean checkCrash(Cell nextCell)
	{
		System.out.println("Going to check for Crash");
		for (Cell cell : snakePartList) {
			if (cell == nextCell) {
				return true;
			}
		}

		return false;
	}

	public LinkedList<Cell> getSnakePartList()
	{
		return snakePartList;
	}

	public void
	setSnakePartList(LinkedList<Cell> snakePartList)
	{
		this.snakePartList = snakePartList;
	}

	public Cell getHead() { return head; }

	public void setHead(Cell head) { this.head = head; }
}
public class Board {

	final int ROW_COUNT, COL_COUNT;
	private Cell[][] cells;

	public Board(int rowCount, int columnCount)
	{
		ROW_COUNT = rowCount;
		COL_COUNT = columnCount;

		cells = new Cell[ROW_COUNT][COL_COUNT];
		for (int row = 0; row < ROW_COUNT; row++) {
			for (int column = 0; column < COL_COUNT; column++) {
				cells[row][column] = new Cell(row, column);
			}
		}
	}

	public Cell[][] getCells()
	{
		return cells;
	}

	public void setCells(Cell[][] cells)
	{
		this.cells = cells;
	}

	public void generateFood()
	{
		System.out.println("Going to generate food");
		while(true){
			int row = (int)(Math.random() * ROW_COUNT);
			int column = (int)(Math.random() * COL_COUNT);
			if(cells[row][column].getCellType()!=CellType.SNAKE_NODE)
				break;
		}
		cells[row][column].setCellType(CellType.FOOD);
		System.out.println("Food is generated at: " + row + " " + column);
	}
}
