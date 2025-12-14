package Lab9_11;
import java.io.*;
import java.util.Scanner;

/**
 * This program will analyze the data file collected in
 * the SalesAnalysisDemo program and return a printed 
 * response with its computations
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 12/13/2025
 */
public class SalesAnalysis
{
    public double[] weeklyTotal;
    public String inputFile;
    public double lineNumber = 0;
    public static final int weeksinmonth = 4;
    
    /**
     * This method will collect the path of the data file
     * and use it to create an array.
     * @param fp the file path entered in SalesAnalysisDemo
     */
    public SalesAnalysis(String fp){
        inputFile = fp;
        weeklyTotal = new double[4];
    }
    /**
     * This method will copy the data file and split its
     * data into four different arrays, with one array for
     * each line from the data file (one week/7 days' worth 
     * of data per array) 
     */
    public void processFile()throws IOException{
        String token = (",");
        File saleprocess = new File(inputFile);
        Scanner pftool = new Scanner(saleprocess);
        while(pftool.hasNextLine()){
            String pfstr = pftool.nextLine();
            String[] pfstring = pfstr.split(token);
            setArrayElement(pfstring);
        }
        pftool.close();     
    }
    /**
     * This method will convert the daily profit values from
     * each array into to doubles, then calculate each 
     * weekly total using the converted values.
     * @param pfstring the arrays of each week of data
     */
    private void setArrayElement(String[] pfstring){
        double doublet = 0;
        for(String parsed : pfstring){
        doublet = Double.parseDouble(parsed);
        weeklyTotal[(int) lineNumber] = weeklyTotal[(int) lineNumber] + doublet;
        }
        lineNumber++;
    }
    /**
     * This method will use the weekly totals to calculate
     * the weekly averages, monthly total and average, and 
     * weeks with the lowest and highest profit. It will 
     * then neatly organize all of the computed data and 
     * print it to a text response.
     */
    public void writeOutput(){
        double SaleTotal = 0;
        double min = weeklyTotal[0];
        double max = weeklyTotal[0];
        int minwk = 0;
        int maxwk = 0;
        int curwk = 0;
        for(int i = 0; i < weeksinmonth; i++){
        SaleTotal = SaleTotal + weeklyTotal[i];
        curwk = i+1;
        if(weeklyTotal[i]>max){
            maxwk = curwk;
            max = weeklyTotal[i];
        }
        else if(weeklyTotal[i]<min){
            minwk = curwk;
            min = weeklyTotal[i];
        }
        System.out.printf("Week%d Info %n",curwk);
        System.out.printf("Total Sales: $%.2f %n",weeklyTotal[i]);
        System.out.printf("Avg Daily Sales for Week: $%.2f %n",weeklyTotal[i]/7);
        System.out.printf("%n");
        }
        System.out.printf("Total sales for all Weeks: $%.2f %n",SaleTotal);
        System.out.printf("Avg Weekly Sales: $%.2f %n",SaleTotal/weeksinmonth);
        System.out.printf("Week%d had the highest amount of sales %n", maxwk);
        System.out.printf("Week%d had the lowest amount of sales", minwk);
    }
}
