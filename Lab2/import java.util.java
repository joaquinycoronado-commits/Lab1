import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your exam score: ");
        double ExamScore = scanner.nextDouble();
        
        if (ExamScore == 161)
        System.out.println("congrats u found the secret message lol");
        else{
        
        if (ExamScore < 70)
        System.out.println("YOU FAILED!");
        
        if (ExamScore >= 70)
        System.out.println("YOU PASSED!");
        }

        
        scanner.close();
    }
}