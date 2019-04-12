public class MethodsMultiplicationAlternativeBonus {

    public static long multiplyWithoutAsterisk(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        long result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplyWithoutAsterisk(4, 7));
    }
}
