package Lab8;


/**
 * This will calculate the cost of the carpet using the RoomSize
 * values and the carpet cost per square foot as input by the user.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 11/24/2025
 */
public class CarpetCost
{
    public RoomSize size;
    public double CostPerSqFt;
    
    /**
     * Records the size and cost inputs from the demo
     * driver.
     * 
     * @param rs the RoomSize object with the name, length and 
     * width values
     * @param CostPerSqFt the cost of carpet per square foot
     */
    public CarpetCost(RoomSize rs, double CostPerSqFt){
        size = new RoomSize(rs);
        this.CostPerSqFt = CostPerSqFt;
    }
    /**
     * Calculates the total cost of the carpet using the room size
     * and cost per square foot.
     * 
     * @return the total cost of the carpet
     */
    public double getCost(){
        size = new RoomSize(RoomSize.name, RoomSize.length, RoomSize.width);
        return CostPerSqFt*size.getArea();
    }
    
    /**
     * Prints the total and unit cost (per square foot) of the
     * carpet.
     * 
     * @return the printed unit and total cost of the carpet
     */
    public String toString(){
        String output = String.format("The cost per sq ft is: $%.2f %nThe total cost is $%.2f",CostPerSqFt,getCost());
        return output;
    }
}