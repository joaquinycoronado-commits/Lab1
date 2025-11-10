package Lab6;
import java.util.Scanner;

/**
 * A program that gives you the area of a 
 * triangle using its base and height.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 10/13/2025
 */
public class Triangle {
    private String name;
    private double base;
    private double height;
    
    /**
     * Presets the name, base and height of the 
     * triangle with placeholder values.
     */
    public Triangle(){
        name = "Placeholder";
        base = 0.0;
        height = 0.0;
        
    }
    /**
     * Records the set name, base, and height values 
     * of the triangle.
     * @param inName, inBase, height
     */
    public Triangle(String inName, double inBase, double height){
        name = inName;
        base = inBase;
        this.height = height;
    }
    /**
     * This method sets the name of the triangle.
     * @param name The name entered by the user.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * This method sets the base value
     * of the triangle.
     * @param base The base entered by the user. 
     */
    public void setBase(double base){
        this.base = base;
    }
    /**
     * This method sets the height value of the
     * triangle.
     * @param height The height entered by the 
     * user.
     */
    public void setHeight(double height){
        this.height = height;
    }
    /**
     * This method will collect the set name, base 
     * and height of the triangle from the user.
     */
     public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a name for your triangle: ");
        name = keyboard.next();
        base = keyboard.nextDouble();
        height = keyboard.nextDouble();
    }
    /**
     * Calculates the area of the triangle.
     * @return getArea the calculated area.
     */
    private double getArea(){
        return ((base * height) * 0.5);
    }
    /**
     * This method will write and display the 
     * name, base, height, and area to the user.
     */
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("The area is %.1f\n\n", getArea());
    } 
}
