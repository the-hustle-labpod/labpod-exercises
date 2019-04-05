
import java.util.*;

public class BonusIO {


    public static int getIntBinary (){
        Scanner scanner=new Scanner(System.in);
        String hold = scanner.nextLine();
        int result;
        try {
            result = Integer.valueOf(hold,2);
        } catch (NumberFormatException e){
            System.out.println("Not a valid number, please try again");
            return getIntBinary();
        }
        return result;
    }

    public  int getIntHex (){
        Scanner scanner=new Scanner(System.in);
        String hold = scanner.nextLine();
        int result;
        try {
            result = Integer.valueOf(hold,16);
        } catch (NumberFormatException e){
            System.out.println("Not a valid number, please try again");
            return getIntHex();
        }
        return result;
    }

    public  void main(String[] args) {
    }
}

