package tree;


/**
 * Write a description of class Quotient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quotient implements Expr
{
    Expr left, right;

    /**
     * Constructor for objects of class Quotient
     */
    public Quotient(Expr left, Expr right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
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
        return "(" + left + "/" + right + ")";
    }
    
    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left.equals(right))
            return new Constant(1);
        if(right instanceof Constant)
        {
            Constant tempRight = (Constant) right;
            if(tempRight.getValue() == 1)
                return left;
        }
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Quotient))
            return false;
        Quotient other = (Quotient) obj;
        return left.equals(other.left) && right.equals(other.right); 
    }
}
