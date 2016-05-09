 
import list.*;

/**
 * Test the List ADT.
 * 
 * @author (sdb) 
 * @version (Sep 2014)
 */
public class DriverFall14_Lab2
{
          
    public static void main ()
    {
    List <Integer> grades = new LinkedList<Integer> ();
    
    for (int i=0; i<10; i++)
        grades.add (i * 10);
        
    grades.add (3, 25);
    System.out.println (grades);
    
    System.out.println (grades.get(3));     // should be 25
    
    grades.set (5,55);
    System.out.println (grades);
    
    grades.remove (2);                      // remove position 2
    System.out.println (grades);
    
    System.out.println ("Testing iterators");
    List <String> names = new ArrayList <String> ();
    names.add ("mary");
    names.add ("joe");
    names.add ("mary");
    
    int grade;
    String name;
    Iterator <Integer> gradeItty = grades.iterator();
    while (gradeItty.hasNext())
        {    grade = gradeItty.next();
             System.out.println ("Grade is " + grade);
             if (grade < 25)
                gradeItty.remove();
         }
    System.out.println (grades);       
    
   Iterator <String> nameItty = names.iterator();
   while (nameItty.hasNext())
        {   name = nameItty.next();
            System.out.println ("Name is " + name);
            if (name.length() < 4)
                nameItty.remove();
         }
   System.out.println (names); 
    }
}
