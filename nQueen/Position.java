package nQueen;


/**
 * Store a row number and column number for a position 
 * on a chess board for the n Queens problem
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Position
{
    int row, col;
    
    public Position (int r, int c)
    {
        row = r;
        col = c;
    }
    
    /**
     * @return true only if this position is equal to 
     * the other position, obj
     * 
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Position))
            return false;
        Position other = (Position)obj;
        return row == other.row && col == other.col;
    }
    
    /** 
     * @return true only if this position can 
     * attacjk a Queen on the other position
     */
    public boolean isAttacking(Position other)
    {
        return sameCol(other) || sameRow(other) || 
               sameMajorDiag(other) || sameMinorDiag(other);
    }
    
    private boolean sameCol(Position other)
    {
        return col == other.col;
    }
    
    private boolean sameRow(Position other)
    {
        return row == other.row;
    }
    
    private boolean sameMajorDiag(Position other)
    {
        return (row + col) == (other.row + other.col);
    }
    
    private boolean sameMinorDiag(Position other)
    {
        return (row - col) == (other.row - other.col);
    }
    
    public String toString()
    {
        return "(" + row + "," + col + ")";
    }
}
