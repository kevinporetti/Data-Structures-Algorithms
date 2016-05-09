 
import stack.*;
import java.util.Scanner;
/**
 * Evaluate postfix expressions
 * Assume that numbers and operators are separated by one space.
 * Assume that the expressions are well-formed.
 * @author (sdb and PUT YOUR NAME HERE) 
 * @version (Sep 2014)
 */
public class Lab03p3
{
    // read postfix expressions from the keyboard, and evaluate
    public static void postfixEval()
    {   
        Stack <Integer> stack = new Stack <Integer> ();
        
        // read expression from the keyboard
        Scanner scanner = new Scanner (System.in);
        
        String input;       // store an entire expression
        String [] opInts;   // Each string is an operator or an int.
        int right;           // store right operand
        int n1;     //result of 1st popping
        int n2;     // result of 2nd popping
        
        System.out.println ("Enter postfix expressions, or Enter to terminate");
        input = scanner.nextLine();
        while (input.length() > 0)
        {   
            opInts = input.split (" ");      // An array of Strings, delimiter is space
            char first;    
            
            // fill in the body of this loop:
            for (String s : opInts)
            {   // is the string s a number or operator?
                first = s.charAt(0);
                if (Character.isDigit(first))
                    stack.push(Integer.parseInt(s));
                else
                {
                    n1 = stack.pop();
                    n2 = stack.pop();
                    switch (first)
                    {
                        case '+':
                            right = n1 + n2;
                            stack.push(right);
                            break;
                        case '-':
                            right = n1 - n2;
                            stack.push(right);
                            break;
                        case '*':
                            right = n1 * n2;
                            stack.push(right);
                            break;
                        case '/':
                            right = n1 / n2;
                            stack.push(right);
                            break;
                        default:
                            System.out.println("Invalid expression");
                    }
                }       // reached end of an expression
                if (!stack.isEmpty())
                    System.out.println (stack.peek());
                stack.clear();
                
                input = scanner.nextLine();
                }
            }        
    } 
}
