package FinalProject;
import java.io.*;

/**
 * This program collects the data from all of the other files in this package and prints it into a table in the output file.
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 2025-12-18
 */
public class RegDemo
{
    public static void main(String[] args)throws IOException{
        RegistrationMethods deptoff = new RegistrationMethods();
        int size;
        
        deptoff.setFileNames();
        size = deptoff.getArraySize();
        CarOwner[] reg = new CarOwner[size];
        deptoff.processTextToArray(reg);
        deptoff.printArrayToFile("List of Car Owners", reg);
        CarOwner[] almostDue = deptoff.flagAlmostDueOwners(reg);
        deptoff.printArrayToFile("Owners with registration expiring in three months or less", almostDue);
        CarOwner[] overDue = deptoff.flagOverdueOwners(reg);
        deptoff.printArrayToFile("Owners with Expired Registration", overDue);
        System.out.println("The output file can be found at: " + deptoff.getOutputFileName());
        
    }
}