
//Write a program that prints
//
//        Project 1 written by YOURNAME
//        and presents the tables of the operations listed below of an integer number (greater than 0) that will be requested to the user:
//        Addition
//
//        Substraction
//
//        Multiplication
//
//        Division
//
//        Mod (Remainder)


//1. Addition table
//
//        5	 + 0	 = 5
//        5	 + 1	 = 6
//        5	 + 2	 = 7
//        5	 + 3	 = 8
//        5	 + 4	 = 9
//        5	 + 5	 = 10
//        5	 + 6	 = 11
//        5	 + 7	 = 12
//        5	 + 8	 = 13
//        5	 + 9	 = 14
//
//        2. Substraction table
//
//        5	 - 1	 = 4
//        5	 - 2	 = 3
//        5	 - 3	 = 2
//        5	 - 4	 = 1
//        5	 - 5	 = 0
//        5	 - 6	 = -1
//        5	 - 7	 = -2
//        5	 - 8	 = -3
//        5	 - 9	 = -4
//        5	 - 10	 = -5
//
//        3. Multiplication table
//
//        5	 * 1	 = 5
//        5	 * 2	 = 10
//        5	 * 3	 = 15
//        5	 * 4	 = 20
//        5	 * 5	 = 25
//        5	 * 6	 = 30
//        5	 * 7	 = 35
//        5	 * 8	 = 40
//        5	 * 9	 = 45
//        5	 * 10	 = 50




//#######solution1

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number (1-99):");
        int userChoice = scanner.nextInt();
        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
        for (int i = 0; i <= 9; i++) {
            int j = userChoice + i;
            System.out.format("%6d | %7d | %6d%n", userChoice, i, j);

        }
//#######solution2
        System.out.println("Please enter an integer number (1-99):");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
        for (int i = 0; i <= 9; i++) {
            int j = userInput - i;
            System.out.format("%6d | %7d | %6d%n", userInput, i, j);

        }
        //######solution3
        System.out.println("Please enter an integer number (1-99):");
        int selectedNumber = scanner.nextInt();
        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
        for (int i = 0; i <= 9; i++) {
            int j = selectedNumber *i;
            System.out.format("%6d | %7d | %6d%n", selectedNumber, i, j);


        }
    }
}