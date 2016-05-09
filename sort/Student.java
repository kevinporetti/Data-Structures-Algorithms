package sort;

/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student implements Comparable<Student>
{
    private String name;
    private String ssn;
    private float gpa;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
        this.gpa = 0;
    }

    /**
     * toString
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return name + "(" + ssn + ")";
    }
    
    public int compareTo(Student std)
    {
        if(name.equals(std.name))
            return ssn.compareTo(std.ssn);
        return name.compareTo(std.name);
    }
    
    public int hashCode()
    {
        int hashCode = 17;
        hashCode = 37 * hashCode + name.hashCode();
        hashCode = 37 * hashCode + ssn.hashCode();
        return hashCode;
    }
    
    public boolean equals(Object obj)
    {
        Student tempStud = null;
        if(obj instanceof Student)
            tempStud = (Student)obj;
        return (this.name).equals(tempStud.name) && (this.ssn).equals(tempStud.ssn);
    }
}
