package Lab7;
import java.util.*;

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
    public void print(int[ ] inArray){
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
    /**
     * Finds and prints the index value of the right-most array number with the given 
     * value.
     * @return lastKeyVal the index value of such number.
     */
    public int findLast(int key){
        int lastKeyVal = -1;
        for(int i=myArray.length-1;i>=0;i--){
            if(lastKeyVal==-1&&key==myArray[i])
            lastKeyVal = i;
        }
        return lastKeyVal;
    }
    /**
     * Finds and prints the index value(s) of all array numbers with the given value.
     * @return findAll the index values of such variables.
     */
    public int[] findAll(int key){
        int i;
        int j;
        int k;
        int ArraySize = 0;
        for(i=0;i<myArray.length;i++){
            if(key==myArray[i])
            ArraySize++;
        }
        int[] newArray = new int[ArraySize];
        for(k=0,j=0;k<myArray.length;k++){
            if(key==myArray[k]){
            newArray[j]=k;
            j++;
            }
        }
        return newArray;
    }
    /**
     * Returns the original array, as initialized.
     * @return the original array.
     */
    public int[] getArray(){
        return myArray;
    }
    /**
     * Returns a copy of the original array.
     * @return a copy of the original array.
     */
    public int[] copyArray(){
        int[] copiedArray=Arrays.copyOf(myArray,myArray.length);
        return copiedArray;
    }
    public int[] reverseArray(int[] inArray){  
        int[] myArrayCopy = new int [inArray.length];
        int j = 0;
        
        for(int i=inArray.length-1;i>=0;i--){
        myArrayCopy[j] = inArray[i];
        j++;
        }
        print(myArrayCopy);
        return myArrayCopy;
    }
}