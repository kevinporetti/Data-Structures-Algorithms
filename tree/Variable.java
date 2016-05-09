package tree;


/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Variable implements Expr
{
    char name;
    
    /**
     * Constructor for objects of class Number
     */
    public Variable(char name)
    {
        this.name = name;
    }

    public char getValue()
    {
        return name;
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
        return name + "";
    }
    
    public Expr simplify()
    {
        return this;
    }
    
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Variable))
            return false;
        Variable other = (Variable) obj;
        return name == other.getValue();
    }
}
