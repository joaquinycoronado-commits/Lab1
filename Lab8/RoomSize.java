package Lab8;


/**
 * This will calculate the area of a room for determining the 
 * total cost of the carpet. It will also print the name, length,
 * and width of the carpet.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 11/24/2025
 */
public class RoomSize{
    public static String name;
    public static double length;
    public static double width;
    
    /**
     * Records the name, length, and width of the room as input
     * by the user
     * 
     * @param name the room's name
     * @param length the room's length
     * @param width the room's width
     */
    public RoomSize(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }
    /**
     * Copies the RoomSize constructor from above into a new 
     * "temporary" constructor.
     * 
     * @param rstemp a copy of the RoomSize constructor
     */
    public RoomSize(RoomSize rstemp){
        name = rstemp.name;
        length = rstemp.length;
        width = rstemp.width;
    }
    /**
     * Calculates the room's area using its length and width.
     */ 
    public double getArea(){
        return length*width;
    }
    /**
     * Prints and returns the room's name, length, width, and 
     * area.
     */
    public String toString(){
        String output = String.format("Room Name: %s %nLength: %.1f %nWidth: %.1f %nArea: %.2f",name,length,width,getArea());
        return output;
    }
}
