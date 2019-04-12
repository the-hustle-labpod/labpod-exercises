import java.util.Scanner;

public class ConsoleIOBonus {
    public static void main(String[] args) {
//////////////////////////////////////
///////////// Console IO /////////////
//////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

///////////////// Using decimals //////////////////////
        System.out.println("Please enter the length of the room, in decimal format: ");
        double userLength = scanner.nextDouble();
        System.out.println("Please enter the width of the room, in decimal format: ");
        double userWidth = scanner.nextDouble();
        System.out.println("Please enter the height of the room, in decimal format:");
        double userHeight = scanner.nextDouble();
///////////////////////////////////////////////////////

        System.out.format("You entered a length of %.2f, a width of %.2f, and a height of %.2f.\n", userLength, userWidth, userHeight);
        System.out.println();
        System.out.printf("The area of the room is %.2f square feet.%n", userLength*userWidth);
        System.out.printf("The perimeter of the room is %.2f feet.%n", 2*userLength + 2*userWidth);
        System.out.printf("The volume of the room is %.2f cubic feet.%n", userLength*userWidth*userHeight);
    }

}
