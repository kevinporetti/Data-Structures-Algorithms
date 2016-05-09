package set;
import list.*;

/**
 * Write a description of class asListDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asListDriver
{
    public static void main()
    {
        List<String> treeTestList;
        List<String> hashTestList;
        
        Set<String> treeset = new TreeSet<String>();
        Set<String> hashset = new HashSet<String>();
        
        treeset.add ("sue");
        treeset.add ("jim");
        treeset.add ("sue");
        treeset.add ("harry");
        treeset.add ("sue");
        treeset.add ("mary");
        
        hashset.add ("joe");
        hashset.add ("jim");
        hashset.add ("john");
        hashset.add ("harry");
        hashset.add ("john");
        hashset.add ("sally");
        
        treeTestList = treeset.asList();
        hashTestList = hashset.asList();
        
        System.out.println(treeTestList);
        System.out.println(hashTestList);
    }
}
