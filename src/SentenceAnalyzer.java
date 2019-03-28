import java.util.Scanner;

public class SentenceAnalyzer {


    public static boolean isVowel(String input) {
        if (input.length() > 1) {
            return false;
        }return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");
    }

    public static int countVowels(String userInput){
        int accumulator = 0;
        for (int i = 0; i <= userInput.length()-1; i++){
            String letter = userInput.charAt(i) + "";
            if(isVowel(letter)) {
                accumulator++;
            }
        } return accumulator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String userInput=scanner.nextLine();
        System.out.println("It has "+countVowels(userInput)+" vowels");
    }

}
