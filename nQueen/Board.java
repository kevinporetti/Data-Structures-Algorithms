package nQueen;
import list.*;

/**
 * A chess board for the n Queens problem.
 * Store a list of positions on which there 
 * are queens.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    List<Position> queens; 
    
    public Board()
    {
        queens = new LinkedList <Position>();
    }
    
    public Board(Board b)
    {
        this.queens = new LinkedList<Position>(b.queens);
    }
    
    /**
     * @return true if any Queen on this Board is attacking
     * any other Queen.
     */
    public boolean check()
    {
        Iterator<Position> iter1 = queens.iterator(),
                           iter2;
                           
        Position p, other;
        
        while(iter1.hasNext())
        {
            p = iter1.next();
            iter2 = queens.iterator();
            
            while(iter2.hasNext())
            {
                other = iter2.next();
                if(!p.equals(other))    //perhaps change this so isAttacking checks equality 
                    if(p.isAttacking(other)) //see above
                        return true;
            }
        }
        return false;
    }
    
    public String toString()
    {
        String result = "";
        
        for(int row=0; row < Game.SIZE; row++)
        {
            for(int col = 0; col < Game.SIZE; col++)
            {
                if(queens.contains(new Position(row, col)))
                    result += 'Q';
                else
                    result += '.';
            }
            result += '\n';
        }
        
        return result;
    }
}
