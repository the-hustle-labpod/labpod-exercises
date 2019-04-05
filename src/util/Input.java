package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.print("Please enter a word: ");
        return scanner.nextLine();
    }


    public boolean yesNo() {
//        System.out.print("Enter 'y' or 'yes' to continue (otherwise the program will end).");
        String response = scanner.next();
//        String response = scanner.nextLine();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }


    public int getInt() {
        int returnInteger = 0;
        String userInput;
        userInput = scanner.nextLine();
        try {
            returnInteger = Integer.valueOf(userInput);
        } catch (NumberFormatException nfe) {
//            System.out.println(nfe);
            return getInt();
        }
        return returnInteger;
    }



    public int getInt (int min, int max) throws NumberFormatException {
        Integer userInt;
        String input = scanner.nextLine();
        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
//        scanner.next();
        return getInt(min, max);
    }



    public double getDouble() {
        double returnDouble = 0;
        String userInput;
        userInput = scanner.nextLine();
        try {
            returnDouble = Double.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble();
        }
        return returnDouble;
    }



    public double getDouble (double min, double max) {
        Double userDouble;
        String input = scanner.nextLine();
        try {
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble(min, max);
        }
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        scanner.next();
        return getDouble(min, max);
    }

    public static void main(String[] args) {
        Input in = new Input();
    }
}

