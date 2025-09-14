
/**
 * This is a simple program showcasing the imprecision of equations
 * involving large numerical values in Java when executed
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/7/2025
 * @version v1.0
 */
public class Lab2Imprecision
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