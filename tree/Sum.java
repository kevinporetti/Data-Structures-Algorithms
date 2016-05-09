package tree;


/**
 * Write a description of class Sum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sum implements Expr
{
    Expr left, right;

    /**
     * Constructor for objects of class Sum
     */
    public Sum(Expr left, Expr right)
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
        return "(" + left + "+" + right + ")";
    }
    
    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left.equals(right))
            return new Product(new Constant(2), left);
        if(left instanceof Constant)
        {
            Constant tempLeft = (Constant) left;
            if(tempLeft.getValue() == 0)
                return right;
        }
        if(right instanceof Constant)
        {
            Constant tempRight = (Constant) right;
            if(tempRight.getValue() == 0)
                return left;
        }
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Sum))
            return false;
        Sum other = (Sum) obj;
        return left.equals(other.left) && right.equals(other.right) ||
               left.equals(other.right) && right.equals(other.left);
    }
}
