 

import map.*;
import set.*;
import list.Iterator;
import sort.Student;

/**
 * Test the HashMap
 * 
 * @author (sdb) 
 * @version (Mar 2012)
 */
public class MapDriverLab10
{
    public static void main()
    {   Map <String, Student> students = new HashMap <String, Student> ();
    
       assert students.isEmpty() ;
        
        students.put ("343", new Student ("jim", "343"));
        students.put ("444", new Student ("harry", "444"));
        students.put ("333", new Student ("mary", "333"));
        students.put ("211", new Student ("sarah", "211"));
        students.put ("333", new Student ("susie", "333"));
        System.out.println ("students are " + students);
        assert students.size() == 4 : "Error in size method for HashMap";
        
        assert students.get("333").equals (new Student ("susie", "333")) : "Error in get for HashMap";
        students.clear();
        students.put ("343", new Student ("jim", "343"));
        assert students.remove ("343").equals (new Student ("jim", "343"));
        assert students.isEmpty() ;
        assert students.size() == 0;
        
        ///////////////////////
        // Uncomment the following lines when ready for problem 3
        ///////////////////////
        System.out.println();
        Map <String, Integer> grades = new HashMap <String, Integer> ();
        grades.put ("jim", 95);
        grades.put ("susie", 100);
        grades.put ("harry", 88);
        grades.put ("sarah", 99);
        
        System.out.println ("grades: " + grades);
        System.out.println ("Average grade is " + average (grades));
        
        
}

private static double average (Map <String, Integer> map)
{
    double total = 0.0;
    
    if(map.isEmpty())
        return total;
    
    Set<String> keySet = map.keySet();
    Iterator<String> setIter = keySet.iterator();
    
    while(setIter.hasNext())
    {
        total += map.get(setIter.next());
    }
    
    return total / keySet.size();
}
            
  
}
