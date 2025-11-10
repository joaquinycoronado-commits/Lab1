package Lab7;
import java.util.Arrays;

/**
 * Prints and returns several characteristics of an array, including total amount of 
 * numbers, sum of numbers, average of numbers, highest number and index of highest 
 * numbers.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 11/3/2025
 */
public class ArrayMethods{   
    int[] myArray = {7,8,8,3,4,9,8,7};
    /**
     * determines total amount of numbers in array
    @return counttotal the amount of numbers in the array
    */
    public int count(){
        int counttotal = 0;
        for(int i = 0;i<myArray.length;i++){
            counttotal++;
        }   
        return counttotal;
    }
    /**
     * adds up all numbers in array
    @return sumtotal total of all numbers in array
    */
    public int sum(){
       int sumtotal = 0;
       for(int i = 0;i<myArray.length;i++){
            sumtotal += myArray[i];
        }
        return sumtotal;
    }
    /**
     * determines average of numbers in array
    @return sum()/myArray.length sum divided by array total
    */
    public double average(){
        return (double) sum()/myArray.length;
    }
    /**
     * determines highest number in array
    @return highest number in array
    */
    public int findMax(){
        int highest = myArray[0];
        for (int i=1;i<myArray.length;i++){
            if(myArray[i] > highest)
            highest = myArray[i];
        }
        return highest;
    }
    /**
     * determines index of highest number in array
    @return highestIndex index of highest number in array
    */
    public int findIndexOfMax(){
        int i=0;
        while(findMax()!=myArray[i])
        i++;
        return i;

    }
    /**
     * prints an int array, nicely formatted
    @param inArray int array to print
    */
    public void print(int[ ] inArray)
    {
    System.out.print("{");
    int i;
    for (i = 0; i < inArray.length - 1; i++)
    System.out.print(inArray[i] + ", ");
    if (inArray.length > 0)
    System.out.print(inArray[i]);
    System.out.println("}");
    }
} 