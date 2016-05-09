package map;


/**
 * A Book has a title (String), an author (String),
 * and a number of pages (int).  Provide constructor(s) and accessor methods.
 * Two Books are considered equal iff they have the same title.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book implements Comparable<Book>
{
    String title;
    String author;
    int pages;
    
    /**
     * Default constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        title = "";
        author = "";
        pages = 0;
    }
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public boolean equals(Object obj)
    {
        Book tempBook = null;
        
        if(obj instanceof Book)
            tempBook = (Book)obj;
            
        if((this.getTitle()).equals(tempBook.getTitle()))
            return true;
            
        return false;
    }
    
    public int compareTo(Book cmpBook)
    {    
        return (this.getTitle()).compareTo(cmpBook.getTitle());
    }
    
    public String toString()
    {
        return title;
    }
}
