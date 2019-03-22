import java.util.Scanner;
public class LuisPodExercises {
    public static void mathStuff(int a) {

        System.out.println("1. Addition table\n");
        for (int i = 1; i < 11; i++) {
            System.out.println(a + "+" + i + "=" + (a + i));
        }
        System.out.println("2. Substraction table\n");
        for (int j = 0; j < 11; j++) {
            System.out.println(a + " - " + j + "    =" + (a - j));
        }
        System.out.println("3. Multiplication Table\n");
        System.out.println("");
        for (int k = 0; k < 11; k++) {
            System.out.println(a + " x " + k + "    =" + (a * k));

        }
        System.out.println("4. Division table\n");
        System.out.println("");
        for (int b = 1; b < 11; b++) {
            System.out.println(a + " / " + b + "     =" + (a / b));
        }
        System.out.println("5. Remainder table\n");
        System.out.println(" ");
        for (int c = 1; c < 11; c++) {
            System.out.println(a + " % " + c + "    =" + (a % c));
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();
        mathStuff(userInput);


        int start = 1;
        int end = 3;
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum+= i;
        }
        System.out.println(sum);



    }

    }

