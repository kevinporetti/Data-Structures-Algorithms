package recursion;


/**
 * Divides two values recursively
 * 
 * @author Kevin Poretti 
 * @version 10/14/2014
 */
public class Divide
{

    /**
     * Constructor for objects of class Divide
     */
    public Divide()
    {
    }

    /**
     * Divides two values recursively using the rule 
     * 1) a/b is 0 if a < b
     * 2) a/b is 1 + (a-b)/b otherwise
     * 
     * @param a and b are positive
     * @return the quotient of a/b     
     */
    public int divide(int a, int b)
    {
        if(a < b)
            return 0;
        else
            return 1 + divide((a-b), b);
    }
}
