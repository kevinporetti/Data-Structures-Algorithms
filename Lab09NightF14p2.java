 
import hash.*;
import list.*;
import java.io.*;
import java.util.Random;
import sort.Student;

/**
 * Test the HashTable
 * 
 * @author (sdb) 
 * @version (Mar 2012)
 */
public class Lab09NightF14p2
{
    public static void main()
    {   
        HashTable <Student> students = new HashTable <Student> ( );

        if (! students.isEmpty())
            System.out.println ("Not correct");
            
        students.put (new Student ("jim", "423"));
        students.put (new Student ("mary", "433"));
        students.put (new Student ("joe", "422"));
        students.put (new Student ("jim", "421"));
        
        System.out.println ("The students are: " + students);
        if (students.size() != 4)
            System.out.println ("Not correct");
                 
        if (students.get (new Student ("mary", "433")) == null) // mary(433) is in the table
            System.out.println ("Not correct2");
            
        
        
 
}
  
}
