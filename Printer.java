import queue.*;

/**
 * A Printer has a speed, in blocks of printing per step, and a queue of Docs to be printed
 * 
 * @author (sdb)
 * @author (PUT YOUR NAME HERE)
 */
public class Printer
{
    private int speed;      // speed of this printer, blocks per step
    private QueueADT <Doc> docs;    // Queue of documents waiting to be printed
    private int blocksRemaining;    // blocks remaining to be printed on the active doc
    private Doc doc;                // the active document
    private String id;      // name of this Printer
    
    /**
     * Constructor for objects of class Printer
     */
    public Printer(int speed, String id)
    {
       this.speed = speed;
       //docs = new Queue<Doc>();
       docs = new PriorityQueue<Doc>();
       this.id = id;
       blocksRemaining = 0;
    }
    /** Add a document to this printer's queue */
    public void add (Doc doc)
    {
        docs.add(doc);
        System.out.println("Doc of size " + docs.peek().size() + " added to " + this);
    }
 
    /** 
     * Print several blocks, if necessary, determined by this printer's speed.
     */
    public void print()
    {   
        if(blocksRemaining > 0) //Print remaining blocks left over from last step
        {
            blocksRemaining -= speed;
            checkPrintFinished();
        }    
        else
        {
            if(docs.peek() != null)
            {
                doc = docs.peek();
                blocksRemaining = doc.size() - speed;
                checkPrintFinished();
            }
        }
    }
    
    /** @return the number of documents in this Printer's queue */
    public int size()
    {   
        return docs.size();
    }
    
    /** Include the id, speed, and number of docs in the queue */
    public String toString()
    {   
        return id + ", " + "speed: " + speed + " docs in queue: " + size();
    }
    
    private void checkPrintFinished()
    {
        if(blocksRemaining <= 0)
        {
            System.out.println("Print task completed on " + this + " for " + doc);
            docs.remove();
            blocksRemaining = 0;
        }
    }
}
