package Lab2;
import java.util.Scanner;

/**
 * A program that gives you the area of a 
 * triangle using its base and height.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 10/13/2025
 */
public class Triangle
{
    private String name;
    private double base;
    private double height;
    
    public Triangle(){
        name = "Placeholder";
        base = 0.0;
        height = 0.0;
        
    }
    public Triangle(String inName, double inBase, double height){
        name = inName;
        base = inBase;
        this.height = height;
    }
    public String setName(String name){
        return name;
    }
    public double setBase(double base){
        return base;
    }
    public double setHeight(double height){
        return height;
    }
    
     public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a name, base and height for your triangle: ");
        name = keyboard.next();
        base = keyboard.nextDouble();
        height = keyboard.nextDouble();
    }
    
    private double getArea(double base, double height){
        double area = ((base * height) * 0.5);
        return area;
    }
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("The area is %.1f", getArea(base, height));
    } 
}