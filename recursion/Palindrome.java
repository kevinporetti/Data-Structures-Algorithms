package recursion;


/**
 * Palindrome - has method isPalindrome to test if a string is a palindrome,
 *              meaning the string is the same forwards and backwards
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{

    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome()
    {
    }

    /**
     * Checks if a string is a palindrome
     * 
     * @param  str string to be analyzed
     * @return     true if str is a palindrome, false otherwise 
     */
    public boolean isPalindrome(String str)
    {
        if(str.length() <= 1)
            return true;
        else 
        {
            if(str.charAt(0) != str.charAt(str.length()-1))
                return false;
            else
                return isPalindrome(str.substring(1, str.length()-1));
        }
    }
}
