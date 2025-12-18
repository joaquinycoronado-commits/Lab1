package Lab10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    public String name;
    public static final int CURRENT_YEAR = 2025;
    public Person(){
    name = "no name yet";
    }
    public Person(String name){ 
        setName(name);
    }
    public void setName(String name){
        this.name = name; 
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        String tsperson = "Name: " + name + "\n";
        return tsperson;
    }
}