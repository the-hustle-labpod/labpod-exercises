import java.util.Scanner;

public class JavaBonusChallenge1 {
    public static void main(String[] args) {
        //        1) create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)
        boolean confirmation = true;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Please enter a starting number: ");
            int start = scanner.nextInt();
            int restart = start;
            System.out.println();
            System.out.println("Please enter an ending number: ");
            int end = scanner.nextInt();
            int sum = 0;
            while (start <= end) {
                sum += start;
                start++;
            }
            System.out.println();
            System.out.printf("The sum of all numbers from %d to %d is: %d", restart, end, sum);
            System.out.println("\n");
            System.out.println();
            System.out.println();
            System.out.println("Would you like to continue? [y/n]");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("n")) {
                confirmation = false;
            }

        } while (confirmation);

    }

}
