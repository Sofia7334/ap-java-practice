import java.util.Arrays;
class Main{
    public static void main(String[] args){
		Class.stars(5);
	}
}
class Class{
		public static void stars(int num){
		if (num == 1){
			return;
		}
		stars(num - 1);
		for (int i = 0; i < num; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
/*
class Main{
    public static void main(String[] args){
		WordChecker checker = new WordChecker();
		System.out.println(checker.sumPath(1, 3));
}}
class WordChecker {
	int[][] grid = {
    {12, 30, 40, 25, 5},
    {11, 3, 22, 15, 43},
    {7, 2, 9, 4, 0},
	{8, 33, 18, 6, 1}
};
public int sumPath (int row, int col){
	int sum = 0;
	Location loc = new Location(row, col);
	while ((row != grid.length) && (col != grid[row].length)){
		sum += grid[row][col];
		loc = getNextLoc(row, col);
		row = loc.getRow();
		col = loc.getCol();
	}
	return sum;
}
public Location getNextLoc (int row, int col){
	if (((row + 1) < grid.length) && (col + 1) < grid[row].length){
		if (grid[row + 1][col] < grid[row][col + 1]){
			return new Location(row + 1, col);
		} else {
			return new Location(row, col + 1);
		}
	} else if (row + 1 < grid.length){
		return new Location(row + 1, col);
	} else {
		return new Location(row, col + 1);
	}	
}

class Location
{
	private int theRow;
	private int theCol;

	public Location (int r, int c)
	{
		theRow = r;
		theCol = c;
	}

	public int getRow()
	{ return theRow; }

	public int getCol()
	{ return theCol; }
}
}*/