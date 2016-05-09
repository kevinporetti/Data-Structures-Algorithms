package airline;
import list.*;
import map.*;
import java.util.Scanner;
import java.io.*;

/**
 * An Airline has a list of direct flights.
 * It can find a path of direct flights from any airport to any
 * other airport.
 * The path will not necessarily be an optimal path.
 * 
 * @author (sdb) 
 * @version (Nov 2014)
 */
public class Airline
{
    List <Flight> flights;      // direct flights
    Map <String, Airport> map;  // key = airport name
    
    public static void main()
    {   Airline airline = new Airline();
        airline.flights = new ArrayList <Flight> ();
        airline.getFlights();       // get all the direct flights
        System.out.println ("Direct flights are " + airline.flights);
        System.out.println ("The map is " + airline.map);
        
        //System.out.println ("Path from PHL to SFO");
        //System.out.println (airline.path ("PHL", "SFO"));
        //airline.getFlights();           // clear the 'visited' flags
        //System.out.println ("Path from JFK to LAX");
        //System.out.println (airline.path ("JFK", "LAX"));
        //airline.getFlights();           // clear the 'visited' flags
        //System.out.println ("Path from LAX to CVG");
        //System.out.println (airline.path ("LAX", "CVG"));
        
        System.out.println ("Path from SFO to Paris");
        System.out.println (airline.path ("SFO", "Paris"));
    }

    // Read the direct flights from a text file, and
    // put them into the field, flights
    private void getFlights()
    {   
        File inFile = new File("D:\\Dropbox\\Data Structures and Algorithms\\DSA_bluej\\airline\\flights.txt");
        map = new HashMap <String, Airport> ();
        
        try 
        {
            Scanner scanner = new Scanner (inFile);
            String flight, origin, dest;
            
            while (scanner.hasNextLine())
            {   
                flight = scanner.nextLine();
                origin = flight.split(" ")[0];
                dest   = flight.split(" ")[1];
                map.put (origin, new Airport(origin));
                map.put (dest, new Airport (dest));
                flights.add (new Flight (new Airport (origin), 
                                         new Airport (dest)));
            }
            
            scanner.close();
        }
        catch (FileNotFoundException fnfe)
        {   
            System.err.println ("File flights.txt not found");
        }
    }
    
    // Return a list of airports from origin to destination,
    // or empty list if no path exists.
    private List<Airport> path (String origin, String dest)
    {   
        return path (map.get(origin), map.get(dest));
    }
    
    private List <Airport> path (Airport origin, Airport dest)
    {
        List <Airport> result = new LinkedList <Airport> ();
        //origin.visited = true;
        if (origin.equals (dest))           // base case
            {   result.add (origin);
                return result;  
            }
            
        Airport port;
        Iterator <Airport> itty = getAirports (origin).iterator();
        while (itty.hasNext())
        {  
            port = itty.next();
            result = path (port, dest);
            if (result.size() > 0)
            {   
                result.add (0, origin);
                return result;
            }
        }
        return result;
    }
    
    // Return a list of all airports which can be reached directly
    // from origin
    private List <Airport> getAirports (Airport origin)
    {
        List <Airport> result = new LinkedList <Airport> ();
        Iterator <Flight> itty = flights.iterator();
        Flight flight;
        while (itty.hasNext())
        {   
            flight = itty.next();
            if (flight.origin.equals (origin)  &&
                    ! flight.dest.visited)
            {   flight.dest.visited = true;
                result.add (flight.dest);
            }
        }
        return result;
    }
    
    
}
