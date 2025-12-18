package FinalProject;


/**
 * This program collects and returns the names (first and last) of each license owner.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 2025-12-18
 */
public class Citizen
{
    public String firstName;
    public String lastName;
    /**
     * Sets default first and last names.
     */
    public Citizen(){
        firstName = lastName = "no name";
    }
    /**
     * Calls the superclss and creates copies of the citizens' first and last names.
     * @param firstName the citizen's first name.
     * @param lastName the citizen's last name.
     */
    public Citizen(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * Sets the first name of the citizen.
     * @param firstName the citizen's first name.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     * Sets the last name of the citizen.
     * @param lastName the citizen's surname.
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /**
     * Returns the forename of the citizen.
     * @return citizen forename
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * Returns the surname of the citizen.
     * @return citizen surname
     */
    public String getLastName(){
        return this.lastName;
    }
    /**
     * Prints the first and last names.
     * @return the first and last names.
     */
    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }
}