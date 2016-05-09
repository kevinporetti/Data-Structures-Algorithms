package nQueen;


/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static final int SIZE = 6;
    
    public static void main()
    {
        Game game = new Game();
        Board b = new Board();  //empty board
        Board solution = game.placeQueens(0, b);
        
        System.out.println("Final Solution\n" + solution);
    }
    
    // Pre: Queens have been safely place in cols 0..SIZE-1 on Board b
    // Return a Board on which queens have been safely placed in every col,
    // or null if not possible
    private Board placeQueens(int col, Board b)
    {
        Board result;
        
        for(int row = 0; row < SIZE; row++)
        {
            result = new Board(b);
            result.queens.add(new Position(row, col));
            if(!result.check())
            {
                if(col == SIZE-1)   //base case
                    return result;
                else
                {
                    result = placeQueens(col+1, result);
                    if(result != null)
                        return result;
                }
            }
            
            if(result == null)
                System.out.println("Backtracking...");
            else
                System.out.println(result);
        }
        return null;    //could not place a Queen on the given board, in the given col
    }
}
