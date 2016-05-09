package tree;

/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constant implements Expr
{
    int value;
    
    /**
     * Constructor for objects of class Number
     */
    public Constant(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
    
    public Expr getLeft()
    {
        return null;
    }
    
    public Expr getRight()
    {
        return null;
    }
    
    public String toString()
    {
        return value + "";
    }
    
    public Expr simplify()
    {
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Constant))
            return false;
        Constant other = (Constant) obj;
        return value == other.getValue();
    }
}
