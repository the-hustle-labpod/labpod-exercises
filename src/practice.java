
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
//        System.out.println("Please enter an integer number (1-99):");
//        int userChoice = scanner.nextInt();
//        System.out.println("Here is your table!");
//
//        for (int i = 0; i <= 9; i++) {
//            int j = userChoice + i;
//            System.out.format("%6d | %7d | %6d%n", userChoice, i, j);
//
//        }
////#######solution2
//        System.out.println("Please enter an integer number (1-99):");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!");
//
//        for (int i = 0; i <= 9; i++) {
//            int j = userInput - i;
//            System.out.format("%6d | %7d | %6d%n", userInput, i, j);
//
//        }
//        //######solution3
//        System.out.println("Please enter an integer number (1-99):");
//        int selectedNumber = scanner.nextInt();
//        System.out.println("Here is your table!");
//
//        for (int i = 0; i <= 9; i++) {
//            int j = selectedNumber *i;
//            System.out.format("%6d | %7d | %6d%n", selectedNumber, i, j);
//
//
//        }
////         Print a Rectangle of asterick
//
//        //#####solution4#######
//
//        int height;
//        int width;
//        System.out.println("Please enter the height of the rectangle.");
//        height = scanner.nextInt();
//        if (height < 0)
//        {
//            height = 1;
//        }
//        System.out.println("Please enter the width of the rectangle.");
//        width = scanner.nextInt();
//        if(width < 0)
//        {
//            width = 1;
//        }
//
//        for(int h = 0; h < height; h++)
//        {
//            for(int w = 0; w < width; w++)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }




        //BONUS NO 1 FROM DANIEL

//
//        create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)
        //#####SOLUTION#########
//        int end ;
//        int start ;
//        int sum=0;
//        System.out.println("enter the start number");
//        start=scanner.nextInt();
//        end=scanner.nextInt();
//        System.out.println("enter the end number");
//        for (int i = start; i <= end; i++) {
//            sum = sum + i;
//
//        }

//        System.out.println("Sum of the number is: "+sum);



        //BONUS 2 FROM DANIEL

//        2) write a loop which will output all the prime numbers (evenly divisible by only 1 and themselves) between 10 and 10000
        //#####solution########
        for(int counter=0;counter<=1000;counter++){
            boolean notPrime=false;
            for(int i =2;i<=counter;i++){
                if(counter%i==0 && i!=counter){
                     notPrime=true;
                }
            }
            if(notPrime==false){
                System.out.println(counter);
            }
        }

    }
}

