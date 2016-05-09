package tree;


/**
 * Write a description of interface Expr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Expr
{
    Expr getLeft();
    
    Expr getRight();
    
    String toString();
    
    Expr simplify();
    
    boolean equals(Object obj);
}
