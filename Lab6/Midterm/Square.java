package Lab6.Midterm;
import java.util.Scanner;


/**
 * This is a program that will print the names, side lengths
 * and perimiters of three squares, after collecting the info
 * for the second square (which is manually input by the user).
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 10/26/2025
 */
public class Square
{
    private String name;
    public double side;
    public double perimiter;
    
    /**
     * Pre-sets the name and side length with temporary values.
     */
    public Square(){
        name = "nothing";
        side = 0.0;
    }
    
    /**
     * Sets the name and side length values from the SquareDriver class.
     * @param inName - the square's name.
     * @param inSide - the square's side length.
     */
    public Square(String inName, double inSide){
        name = inName;
        side = inSide;
    }
    
    /**
     * Sets the perimiter values and prints the final output (name, side length and perimiter of each
     * square) into the terminal.
     */
    public void postOutput(){
        perimiter = getPerimiter();
        
        System.out.printf("Name: %s%nSide length: %f %nPerimiter: %.2f", name, side, perimiter);
    }
    
    /**
     * Collects the name and side lengths of the second square from the user using a Scanner tool.
     */
    public void getInput(){
        Scanner squareInfo = new Scanner(System.in);
        
        System.out.print("Enter the Square's name: ");
        name = squareInfo.nextLine();
        System.out.print("Enter the Square's side length: ");
        side = squareInfo.nextDouble();
    }
    
    /**
     * Collects the square names from the SquareDriver class.
     * @param newName, the names of the squares.
     */
    public void setName(String newName){
        this.name = newName;
    }
    
    /**
     * Collects the square side lengths from the SquareDriver class.
     * @param newSide, the side lengths of the squares.
     */
    public void setSide(double newSide){
        this.side = newSide;
    }
    
    /**
     * Calculates the perimiters of each square using their side lengths.
     * @return getPerimiter, the square's perimiter.
     */
    private double getPerimiter(){
        return side * 4;
    }
    
}
