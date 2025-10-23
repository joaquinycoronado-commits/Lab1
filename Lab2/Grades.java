package Lab2;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class Grades here.
 *
 * @author (your name)
 * @version v1.0.0
 * @since 10/06/2025
 */
public class Grades
{
    public static void main(String[] args)throws IOException{
        String inFile, outFile;
        inFile = getInFile();
        outFile = getOutFile();
        processFile(inFile, outFile);

    }

    /**
     * Uses Scanner to get and return input file name.
     * @return getInFile
     */
    public static String getInFile(){
        String inFilePath;
        Scanner keyboard = new Scanner(System.in);
        File testFile;

        System.out.print("Enter the name of your input file: ");
        inFilePath = keyboard.nextLine();
        //System.out.println(inFilePath);
        testFile = new File(inFilePath);
        // while(!testFile.exists()){
            // System.out.print ("File not found. Please enter a valid file name: ");
            // inFilePath = keyboard.nextLine();
            // testFile = new File(inFilePath);
        // }
        return inFilePath;
    }

    /**
     * Uses Scanner to get and return output file name.
     * @return getOutFile
     */
    public static String getOutFile(){
        String outFilePath;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of your output file: ");
        outFilePath = keyboard.nextLine();
        return outFilePath;
    }

    public static void processFile(String inFilePath, String outFilePath) throws IOException{
        int assignee, A, B, C, D, F, min, max, total, count;
        int lines = 1;
        double avg;

        File processf = new File(inFilePath);
        Scanner keyboard = new Scanner(processf);
        PrintWriter outpwf = new PrintWriter(outFilePath);

        A=B=C=D=F=0;
        avg = 0.0;
        assignee = keyboard.nextInt();
        min=max=assignee;
        total=count=0;
        while(assignee!=-1){
            if(assignee<min)
                min = assignee;
            if(assignee>max)
                max = assignee;
            count++;
            total+=assignee;

            if(assignee>=90)
                A++;
            else if(assignee>=80)
                B++;    
            else if(assignee>=70)
                C++; 
            else if(assignee>=60)
                D++;  
            else
                F++;
            assignee = keyboard.nextInt();
        }
        if(count==0)
            outpwf.println("No grades to calculate!");
        else{
            outpwf.println("Number of \"A\" grades is: " + A);
            outpwf.println("Number of \"B\" grades is: " + B);
            outpwf.println("Number of \"C\" grades is: " + C);
            outpwf.println("Number of \"D\" grades is: " + D);
            outpwf.println("Number of \"F\" grades is: " + F);
            outpwf.println("");
            outpwf.println("The high score was: " + max);
            outpwf.println("The lowest score was: " + min);
            avg = (double)total/count;
            outpwf.printf("The average was: %.1f\n\n", avg);
        }
        System.out.println("Grade processing completed.");
        System.out.println("You can retrieve the output file at " + outFilePath);

        keyboard.close();
        outpwf.close();

    }
}
