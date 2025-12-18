package FinalProject;


/**
 * This program calls the owners' first and last names and collects the number, registration month and year of each license plate, 
 * then returns it.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 2025-12-18
 */
public class CarOwner extends Citizen
{
    public String license;
    public int month;
    public int year;
    
    /**
     * Calls the superclass and sets default license, month, and year values.
     */
    public CarOwner(){
        super();
        license = "Not Assigned";
        month = 0;
        year = 0;
    }
    /**
     * Calls the firstName and lastName variables of the superclass and copies the license, month, and year values.
     * @param firstName the citizen's first name.
     * @param lastName the citizen's last name.
     * @param license the license number.
     * @param month the month of registration.
     * @param year the year of registration.
     */
    public CarOwner(String firstName, String lastName, String license, int month, int year){
        super(firstName,lastName);
        this.license = license;
        this.month = month;
        this.year = year;
    }
    /**
     * Returns the license number.
     * @return the license number.
     */
    public String getLicense(){
        return this.license;
    }
    /**
     * Returns the registration month.
     * @return the registration month.
     */
    public int getMonth(){
        return this.month;
    }
    /**
     * Returns the registration year.
     * @return the registration year.
     */
    public int getYear(){
        return this.year;
    }
    /**
     * Sets the license number.
     * @param license the license number.
     */
    public void setLicense(String license){
        this.license = license;
    }
    /**
     * Sets the registration month.
     * @param month the registration month.
     */
    public void setMonth(int month){
        this.month = month;
    }
    /**
     * Sets the registration year.
     * @param year the registration year.
     */
    public void setYear(int year){
        this.year = year;
    }
    /**
     * Prints the citizens' license numbers and registration M/Y dates.
     * @return the citizens' license numbers and registration M/Y dates.
     */
    public String toString(){
        String output = super.toString() + "\t\t" + license + "\t\t" + month + "/" + year;
        return output;
    }
    
}