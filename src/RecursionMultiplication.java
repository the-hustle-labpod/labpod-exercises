public class RecursionMultiplication {

    public static long recursionMultiplication(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        if (num2 == 1) {
            return num1;
        }
        return num1 + recursionMultiplication(num1, num2 - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursionMultiplication(9, 10));
    }
}
