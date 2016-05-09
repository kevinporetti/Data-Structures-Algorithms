package tree;


/**
 * Write a description of class Quotient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mod implements Expr
{
    Expr left, right;

    /**
     * Constructor for objects of class Quotient
     */
    public Mod(Expr left, Expr right)
    {
        this.left = left;
        this.right = right;
    }

    public Expr getLeft()
    {
        return left;
    }
    
    public Expr getRight()
    {
        return right;
    }
    
    public String toString()
    {
        return "(" + left + "%" + right + ")";
    }
    
    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left.equals(right))
            return new Constant(0);
        if(right instanceof Constant)
        {
            Constant tempRight = (Constant) right;
            if(tempRight.getValue() == 1)
                return new Constant(0);
        }
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Mod))
            return false;
        Mod other = (Mod) obj;
        return left.equals(other.left) && right.equals(other.right); 
    }
}
