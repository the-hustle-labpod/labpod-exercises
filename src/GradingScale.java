import java.util.Scanner;

public class GradingScale {
    public static void main(String[] args) {
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        boolean confirmation = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your grade (w/o percentage) here: ");
            int userNumberGrade = scanner.nextInt();
            System.out.println();
            if ((userNumberGrade >= 99) && (userNumberGrade <= 100)) {
                System.out.println("Congratulations, you scored an A+!!!");
            } else if ((userNumberGrade >= 94) && (userNumberGrade <= 98)) {
                System.out.println("Great job, you got an A!!");
            } else if ((userNumberGrade >= 90) && (userNumberGrade <= 93)) {
                System.out.println("Nice work, that's an A-!");
            } else if ((userNumberGrade >= 88) && (userNumberGrade <= 89)) {
                System.out.println("Nice, that's a B+.");
            } else if ((userNumberGrade >= 84) && (userNumberGrade <= 87)) {
                System.out.println("Not bad, that's a B.");
            } else if ((userNumberGrade >= 80) && (userNumberGrade <= 83)) {
                System.out.println("Not too bad, that's a B-.");
            } else if ((userNumberGrade >= 78) && (userNumberGrade <= 79)) {
                System.out.println("Well, you got at least got a C+.");
            } else if ((userNumberGrade >= 74) && (userNumberGrade <= 77)) {
                System.out.println("Hey, it could be worse...you got a C.");
            } else if ((userNumberGrade >= 70) && (userNumberGrade <= 73)) {
                System.out.println("You barely passed with a C-.");
            } else if ((userNumberGrade >= 68) && (userNumberGrade <= 69)) {
                System.out.println("Yikes, you got a D+!");
            } else if ((userNumberGrade >= 64) && (userNumberGrade <= 67)) {
                System.out.println("So sorry...you got a D.");
            } else if ((userNumberGrade >= 60) && (userNumberGrade <= 63)) {
                System.out.println("Ouch! You got a D-.");
            } else if ((userNumberGrade >= 0) && (userNumberGrade <= 59)) {
                System.out.println("Woah...dude. You failed with an F.");
            } else {
                System.out.println("Incorrect entry. Please try again.");
            }
            System.out.println();
            System.out.print("Would you like to continue? [y/n]");
            System.out.println();
            String userResponse = scanner.next();
            System.out.println("\n");
            if (userResponse.equalsIgnoreCase("n")) {
                confirmation = false;
            }

        } while (confirmation);
    }
}
