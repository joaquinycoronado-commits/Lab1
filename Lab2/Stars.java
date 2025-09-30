package Lab2;
import java.util.Scanner;

/**
 * This program will create a diamond shape using stars.
 *
 * @author Joaquin Coronado, joaquinycoronado@gmail.com
 * @since 9/28/2025
 * @version v1.0
 */
public class Stars
{
    public static void main(String[] args){
        int width, line, spaces, stars;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();
        if (width%2==0){
            width++;
        }
        for (line=1,spaces=(width-1)/2;line<=(width+1)/2;line++,spaces--){
            for (int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){
                System.out.print("*");
            }
            System.out.println("");     
        }
        for (line=(width-1)/2,spaces=1;line>0;line--,spaces++){
            for (int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    } 
}




        
    
