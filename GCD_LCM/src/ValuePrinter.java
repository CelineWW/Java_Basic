import java.util.Scanner;

public class ValuePrinter {
    public static void printValue(int num1, int num2) {
        int product = 1;
        for (int i = num1; i <= num2; ++i) {
            if (i < 0) {
                product *= i;
            }
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        printValue(num1, num2);
        scanner.close();
    }
}
