package stack;
import list.*;

public class Stack<E> implements StackADT<E>
{
    List<E> values = new LinkedList<E>();
    
    /**
     * Constructor for objects of class Stack
     */
    public Stack()
    {
    }
    
    public E push(E value)
    {
        values.add(value);
        return value;
    }
    
    public E pop()
    {
        return values.remove(values.size()-1);
    }
    
    public E peek()
    {
        return values.get(values.size()-1);
    }
    
    public boolean isEmpty()
    {
        return values.isEmpty();
    }

    public void clear()
    {
        values.clear();
    }

    public String toString()
    {
        return values.toString();
    }
    
    public boolean equals(Object obj)
    {
        Stack<E> tempStack;
        if(!(obj instanceof StackADT) || obj == null)
            return false;
        tempStack = (Stack)obj;
        return values.equals(tempStack.values);
    }
}
