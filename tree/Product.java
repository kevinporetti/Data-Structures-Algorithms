package tree;


/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product implements Expr
{
    Expr left, right;

    /**
     * Constructor for objects of class Quotient
     */
    public Product(Expr left, Expr right)
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
        return "(" + left + "*" + right + ")";
    }
    
    public Expr simplify()
    {
        left = left.simplify();
        right = right.simplify();
        if(left instanceof Constant)
        {
            Constant tempLeft = (Constant) left;
            if(tempLeft.getValue() == 0)
                return new Constant(0);
            if(tempLeft.getValue() == 1)
                return right;
        }
        if(right instanceof Constant)
        {
            Constant tempRight = (Constant) right;
            if(tempRight.getValue() == 0)
                return new Constant(0);
            if(tempRight.getValue() == 1)
                return left;
        }
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
        return left.equals(other.left) && right.equals(other.right) ||
               left.equals(other.right) && right.equals(other.left); 
    }
}

