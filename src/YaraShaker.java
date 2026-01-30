import java.util.Scanner;
public class YaraShaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Arithmetic operations
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Remainder = " + (num1 % num2));
        } else {
            System.out.println("Cannot calculate remainder (division by zero)");
        }

        // If conditions
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else if (num2 > num1) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

        // Logical operators
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both are positive");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("One is positive");
        } else {
            System.out.println("No positives");
        }
        // Ternary operator
        String greater =
                (num1 > num2) ? "num1 is greater" :
                        (num2 > num1) ? "num2 is greater" :
                                "Both are equal";

        System.out.println(greater);

        String evenOdd = (num1 % 2 == 0) ? "num1 is Even" : "num1 is Odd";
        System.out.println(evenOdd);

        input.close();
    }
}