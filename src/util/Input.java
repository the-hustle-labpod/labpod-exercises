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
        int userInteger = 0;
        String userInput;
        userInput = scanner.next();
        try {
            userInteger = Integer.valueOf(userInput);
        } catch (Exception e) {
            System.out.println(e);
            return getInt();
        }
        return userInteger;
    }

    public int getInt (int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        scanner.next();
        return getInt(min, max);
    }



    public double getDouble() {
        double userDouble = 0;
        String userInput;
        userInput = scanner.next();
        try {
            userDouble = Double.valueOf(userInput);
        } catch (Exception e) {
            System.out.println(e);
            return getDouble();
        }
        return userDouble;
    }

    public double getDouble (double min, double max) {
        double userDouble = getDouble();
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

