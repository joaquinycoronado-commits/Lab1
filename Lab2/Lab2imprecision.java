package Lab2;


/**
 * Write a description of class Lab2imprecision here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab2imprecision extends Lab2gtky
{
    public static void main(String[] args) {
    double x = 12345.6789e200;
    double y = 1/x;
    double z = x*y;
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(1-z);
    }
}
