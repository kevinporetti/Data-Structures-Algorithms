package sort;
import hash.*;

/**
 * Write a description of class StudentHashDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentHashCodeDriver
{
    public static void main()
    {
        Student s1 = new Student ("mary", "433");
        Student s2 = new Student ("mary", "433");
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
