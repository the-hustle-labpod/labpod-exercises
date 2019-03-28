import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateConverterChallenge {
    public static void main(String[] args) {
        //        Create a date format converter tool in a class called DateConverter.
//
//        Take in a string in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
//
//        Separate your logic into various methods, as needed.
//
//        As an extra challenge, use method overloading to take in an optional
//        boolean second argument that specifies if the date conversion should
//        happen in reverse (e.g. taking in "December 12, 1999" and outputting
//        "12/01/1999").


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date in the MM/DD/YYYY format: ");
        String userDate = scanner.next();
        System.out.println(dateConversion(userDate));


    }

    public static String dateConversion(String userDate) {
        Date date = new Date(userDate);
        String pattern = "MMMMM dd, yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String format = formatter.format(date);
//        System.out.println(format);
        return format;
    }
}
