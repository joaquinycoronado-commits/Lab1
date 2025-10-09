package Lab2;
import java.util.Scanner;
import java.io.*;

public class genreExtract {
    public static void main(String[] args){
        String titleInput = "tempPlaceholder";
        String genreDetected = "tempPlaceholder";
        char redotest;
        
        Scanner userInput = new Scanner(System.in);
        
        do {
            System.out.print("Enter a song title. genreExtract will make its very best effort to guess the song's genre by analyzing different aspects of its title: ");
            titleInput = userInput.nextLine();
            String forDetect = titleInput.toLowerCase();
            genreDetected = Giveaways(forDetect, genreDetected);
            
            System.out.println("");
            switch(genreDetected){
                case "metal":
                System.out.println(titleInput + " has been identified as \"metal\" by genreExtract.");
                break;
                case "country":
                System.out.println(titleInput + " has been identified as \"country\" by genreExtract.");
                break;
                case "punk":
                System.out.println(titleInput + " has been identified as \"punk\" by genreExtract.");
                break;
                case "reggae":
                System.out.println(titleInput + " has been identified as \"reggae\" by genreExtract.");
                break;
                case "rock":
                System.out.println(titleInput + " has been identified as \"rock\" by genreExtract.");
                case "pop":
                System.out.println(titleInput + " has been identified as \"pop\" by genreExtract.");
                break;
                case "happy hardcore":
                System.out.println(titleInput + " has been identified as \"happy hardcore\" by genreExtract");
                break;
                default: System.out.println("genreExtract could not identify the genre of the song titled " + titleInput + ". The song may belong to a genre not currently recognized by genreExtract.");
            }

            
            System.out.println ("Test another song title? (Yes/No)");
            redotest = userInput.nextLine().toUpperCase().charAt(0);
            
        } while(redotest == 'Y');
    }
    /**
     * This is a method that will identify "giveaway" phrases in song titles. If the phrase is included in the song's title, the song's genre will be detected immediately.
     * @param forDetect, genreDetected
     * @return genreDetected
     */
    public static String Giveaways(String forDetect, String genreDetected){
        boolean containsRave = forDetect.contains("rave"), containsKandi = forDetect.contains("kandi");
        boolean containsDeath = forDetect.contains("death");
        boolean containsKissMe = forDetect.contains("kiss me"), containsHere = forDetect.contains("here"), containsCali = forDetect.contains("california");
        boolean containsWhisky = forDetect.contains("whisky"), containsWhiskey = forDetect.contains("whiskey");
        if(containsRave || containsKandi == true)
        genreDetected = "happy hardcore";
        if(containsWhisky || containsWhiskey == true)
        genreDetected = "country";
        if(containsDeath == true)
        genreDetected = "metal";
        if(containsKissMe || containsHere || containsCali == true)
        genreDetected = "pop";
        
        return genreDetected;
    }


}
