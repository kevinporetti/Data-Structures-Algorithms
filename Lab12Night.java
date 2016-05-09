 
import map.*;
import list.*;
import sort.*;
import java.io.*;
import java.util.Arrays;

/**
 * Test the Map implementations
 * Lab 10
 * 
 * @author (sdb) 
 * @version (Nov 2012)
 */
public class Lab12Night
{
    public static void main()
    {   Library library = new Library();

        Book b = new Book ("Intro to Java", "Barnes", 332);
        library.borrow (b);      // borrow Intro to Java 3 times
        library.borrow (b);
        library.borrow (b);

        b = new Book ("Data Structures", "Weiss", 423);
        library.borrow (b);

        b = new Book ("Operating Systems", "Tanenbaum", 388);
        library.borrow (b);

        b = new Book ("Intro to Java", "Smith", 287);     // borrow Intro a 4th time
        library.borrow (b);

        System.out.println (library);
    }

    
////////  Uncomment the following when ready for problem 2
    private Map <String, List<String>> wordMap = new HashMap<String, List<String>> ();

    public static void problem2()
    {   Lab12Night lab12 = new Lab12Night();
        lab12.translate();
    }
    
    private void translate()
    {    
        buildMap();
        System.out.println (sort("ptos"));
        System.out.println (sort("rbag"));
        System.out.println (wordMap.get(sort("ptos")));
        System.out.println (wordMap.get(sort("rbag")));
        System.out.println("*Problem 3*");
        System.out.println(wordMap.get(sort("niaiuanmrisotzrtiiocm"))); 
        System.out.println(wordMap.get(sort("fo")));
        System.out.println(wordMap.get(sort("uealcisonlesm")));
        System.out.println(wordMap.get(sort("npesoaw")));
        System.out.println(wordMap.get(sort("tpso")));
        System.out.println(wordMap.get(sort("nialtrenosotiaertuc")));
    }

    /** @return a String consisting of the characters in the given String, s,
      *  in alphabetic order.
      */
    private String sort(String s)
    {   //  Fill in the missing code here
        List<Character> stringChars = new LinkedList<Character>();
        String result = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            stringChars.add(s.charAt(i));
        }
        
        QuickSort<Character> qs = new QuickSort<Character>(stringChars);
        qs.sort();
        
        stringChars = qs.getList();
        Iterator<Character> iter = stringChars.iterator();
        while(iter.hasNext())
        {
            result += iter.next();
        }
        
        return result;
    }

    void buildMap()
    {   File inFile = new File ("D:\\Dropbox\\Data Structures and Algorithms\\DSA_bluej\\words.txt");
        String word,key;
        List <String> words;
        try
        {   
            java.util.Scanner scanner = new java.util.Scanner (inFile);   
            
            while (scanner.hasNextLine())
            {   
                word = scanner.nextLine();
              
                key = sort(word); 
                
                if(!(wordMap.containsKey(key)))
                {
                    words = new LinkedList<String>();
                    words.add(word);
                    wordMap.put(key, words);
                }
                else
                {
                    words = wordMap.get(key);
                    words.add(word);
                    wordMap.put(key, words);
                }
            }
        }
        catch (IOException ioe)
        {   }
    }

}
