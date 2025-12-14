package Lab9_11;
import java.util.Scanner;
import java.io.*;

/**
 * This program will collect the path to a file with 
 * every daily profit total over 4 weeks and analyze the
 * data for weekly/monthly total and average profits and 
 * the week with the highest and lowest total profit.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * Since 12/13/2025
 */
public class SalesAnalysisDemo
{
    /**
     * This method will collect the file path from the user
     * and analyze it using the processFile and writeOutput
     * methods from the SalesAnalysis class, which will 
     * result in a well-formatted text response.
     */
    public static void main(String[] args)throws IOException{
    Scanner pathfinder = new Scanner(System.in);
    String datafile;
    File testfile;
    
    System.out.print("Enter the path to the SalesData.txt file: ");
    datafile = pathfinder.next();
    testfile = new File(datafile);
    while(!testfile.exists()){
        System.out.print("File not found. Please enter a valid file name: ");
        datafile = pathfinder.next();
        testfile = new File(datafile);
        }
    SalesAnalysis a = new SalesAnalysis(datafile);
    a.processFile();
    a.writeOutput();
    pathfinder.close();
    }
}
