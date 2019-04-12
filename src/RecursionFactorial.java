import java.util.Scanner;

public class RecursionFactorial {

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            String userString = scanner.next();
            System.out.println();
            System.out.printf("Sorry, %s is not a valid entry.%n", userString);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        }

        int userNumber = scanner.nextInt();
        System.out.println();
        if (userNumber < min) {
            System.out.printf("Sorry, that number is too small. Please stay within the range of %d to %d.%n", min, max);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        } else if (userNumber > max) {
            System.out.printf("Sorry, that number is too big. Please stay within the range of %d to %d.%n", min, max);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        } else {
            return userNumber;
        }


    }

    public static long recursionFactorial(int num) {

        if (num == 1) {
            return 1;
        }

        return num * recursionFactorial(num - 1);
    }


    public static void factorialUserInterface(Scanner scanner) {

        boolean keepGoing = true;
        do {
            System.out.printf("Please enter a number between 1 and 16 (inclusive): ");
            int userInput = getInteger(1, 16);
            System.out.printf("The factorial of that number is: %d.%n", recursionFactorial(userInput));
            System.out.println();
            System.out.println("Would you like to continue? [y/n]");
//            Scanner scanner = new Scanner(System.in);
            String userContinue = scanner.next();
            System.out.println();
            if (userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no")) {
                keepGoing = false;
            }
        } while (keepGoing);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        factorialUserInterface(scanner);
    }
}
