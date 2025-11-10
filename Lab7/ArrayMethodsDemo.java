package Lab7;
import java.util.Arrays;


/**
 * Write a description of class ArrayMethods here.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @version v1.0.0
 * @since 11/3/2025
 */
public class ArrayMethodsDemo
{
    public static void main (String[] args){
        ArrayMethods test = new ArrayMethods();
        System.out.println("Lab7 Pt1 - Let's get ready to rumble :-)");
        System.out.println("========================================");
        System.out.println("myArray[] has " + test.count() + " elements");
        System.out.println("The sum of all elements in myArray[] is: " +
        test.sum());
        System.out.printf("The avg of all elements in myArray[] is: %.2f\n",
        test.average());
        System.out.println("The largest number in myArray[] is: " +
        test.findMax());
        System.out.println("The index of the largest number in myArray[] is: " +
        test.findIndexOfMax());
        //Part 2
        System.out.println("\n\nLab7 Pt2 - Let's continue to rumble :-)");
        System.out.println("=======================================");
        System.out.println("The last (or right most) index of 8 is: " +
        test.findLast(8));
        System.out.println("The last (or right most) index of 2 is: " +
        test.findLast(2));
        int[] findAll8s = test.findAll(8);
        System.out.print("8s were located in the following indices ");
        test.print(findAll8s);
        int[] myArray = test.copyArray();
        System.out.print("myArray[] is: ");
        test.print(myArray);
        int[] copyOfMyArray = test.copyArray();
        System.out.print("copyOfMyArray[] is: ");
        test.print(copyOfMyArray);
        System.out.println("myArray[] and copyOfMyArray[] are equal: " +
        Arrays.equals(test.getArray(),copyOfMyArray));
        test.reverseArray(copyOfMyArray);
        System.out.print("copyOfMyArray[] reversed is: ");
        test.print(copyOfMyArray);
        System.out.println("myArray[] and copyOfMyArray[] are equal: " +
        Arrays.equals(test.getArray(),copyOfMyArray));
    }
}