package FinalProject;
import java.util.*;
import java.io.*;

/**
 * Collects the names of the input and output files, analyzes the data from the input file, and prints the analysis into a table in 
 * the output file.
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 2025-12-18
 */
public class RegistrationMethods
{
    private String inputFileName;
    private String outputFileName;
    public static final int REG_MONTH = 4;
    public static final int REG_YEAR = 2025;
    /**
     * Collects and sets the names of the input and output files.
     */
    public void setFileNames(){      
        Scanner rmscanner = new Scanner(System.in);
        File iftester;
        System.out.print("Enter the path to the registrations.csv file: ");
        inputFileName = rmscanner.nextLine();
        iftester = new File(inputFileName);
        while(!iftester.exists()){
            System.out.print("File not found. Please enter a valid registrations.csv file path: ");
            inputFileName = rmscanner.nextLine();
            iftester = new File(inputFileName);
        }
        System.out.print("Enter the path where output.txt should be saved: ");
        outputFileName = rmscanner.nextLine();
        File outfile = new File(outputFileName);
    }
    /**
     * Calculates the size of the array that will be generated (determined by the amount of rows in the input file)
     * @return the amount of rows on the array subtracted by one (since all Java arrays start with a value of zero).
     */
    public int getArraySize(){
        int num = 0;
        String line;
        File fpforarray = new File(inputFileName);
        try{
            Scanner rmarray = new Scanner(fpforarray);
            while(rmarray.hasNextLine()){
                line = rmarray.nextLine();
                num++;
            }
            } catch(FileNotFoundException e){
            System.out.printf("Error: File not found (" + e + ")");
        }
        return num - 1;
    }
    /**
     * Processes the text, converting it to an array for analysis.
     * @param inArray the array of registration data.
     */
    public void processTextToArray(CarOwner[] inArray)throws IOException{
        int index = 0;
        String line;
        File processFile = new File(inputFileName);
        Scanner processScan = new Scanner(processFile);
        line = processScan.nextLine();
        while(processScan.hasNextLine()){
            line = processScan.nextLine();
            String[] tokens = line.split(",");
            String last = tokens[0];
            String first = tokens[1];
            String license = tokens[2];
            int month = Integer.parseInt(tokens[3]);
            int year = Integer.parseInt(tokens[4]);
            inArray[index] = new CarOwner(first, last, license, month, year);
            index++;
        }
        processScan.close();
    }
    /**
     * Prints the array onto an output file.
     * @param inMsg the message header (no registration data to analyze)
     * @param inArray the array of registration data
     */
    public void printArrayToFile(String inMsg, CarOwner[] inArray)throws IOException{
        FileWriter file = new FileWriter(outputFileName, true);
        PrintWriter output = new PrintWriter(file);
        output.println(inMsg);
        for(CarOwner owner:inArray)
            output.println(owner);
        output.println();
        output.close();
    }
     /**
     * Identifies the owners of almost due registrations.
     * @param inArray the array of registration data.
     * @return all identified almost due registration owners.
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray){
        int MCount = REG_YEAR*12+REG_MONTH;
        int num = 0;
        int counter = 0;
        for(int i = 0;i<inArray.length;i++){
            if(MCount - (inArray[i].getYear()*12+inArray[i].getMonth())>=10 && MCount - (inArray[i].getYear()*12+inArray[i].getMonth())<=12)
            counter++;
        }
        CarOwner[] almostDue = new CarOwner[counter];
        for(int i = 0;i<inArray.length;i++){
            if(MCount - (inArray[i].getYear()*12+inArray[i].getMonth())>12)
            almostDue[num] = inArray[i];
            num++;
        }
        return almostDue;
    }
     /**
     * Identifies the owners of overdue registrations.
     * @param inArray the array of registration data.
     * @return all identified overdue registration owners.
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray){
        int MCount = REG_YEAR*12+REG_MONTH;
        int num = 0;
        int counter = 0;
        for(int i = 0;i<inArray.length;i++){
            if(MCount - (inArray[i].getYear()*12+inArray[i].getMonth())>12)
            counter++;
        }
        CarOwner[] overDue = new CarOwner[counter];
        for(int i = 0;i<inArray.length;i++){
            if(MCount - (inArray[i].getYear()*12+inArray[i].getMonth())>12)
            overDue[num] = inArray[i];
            num++;
        }
        return overDue;
    }
    /**
     * Returns the name of the output file.
     * @return the name of the output file.
     */
    public String getOutputFileName(){
        return outputFileName;
    }
}