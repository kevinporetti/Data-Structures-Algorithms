package set;


/**
 * Write a description of class IntersectionDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntersectionDriver
{
    public static void main()
    {  
        Set<String> treeset1 = new TreeSet<String>();  //sue jim harry mary
        
        treeset1.add ("sue");
        treeset1.add ("jim");
        treeset1.add ("sue");
        treeset1.add ("harry");
        treeset1.add ("sue");
        treeset1.add ("mary"); 
        
        Set<String> treeset2 = new TreeSet<String>();  //sue jim harry mary
        
        treeset2.add ("larry");
        treeset2.add ("jim");
        treeset2.add ("harry");
        treeset2.add ("jake");
        treeset2.add ("bobeeno"); 
        
        System.out.println(treeset1.intersection(treeset2));
        
        Set<String> hashset1 = new TreeSet<String>();  //sue jim harry mary
        
        hashset1.add ("sue");
        hashset1.add ("jim");
        hashset1.add ("sue");
        hashset1.add ("harry");
        hashset1.add ("sue");
        hashset1.add ("mary"); 
        
        Set<String> hashset2 = new TreeSet<String>();  //sue jim harry mary
        
        hashset2.add ("larry");
        hashset2.add ("jim");
        hashset2.add ("harry");
        hashset2.add ("jake");
        hashset2.add ("bobeeno"); 
        
        System.out.println(hashset1.intersection(hashset2));
        
        System.out.println(hashset1.intersection(hashset1));
    }
}
