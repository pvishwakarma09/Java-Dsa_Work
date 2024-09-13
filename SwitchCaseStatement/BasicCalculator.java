
import java.util.Scanner;

// Basic Calculator App using Switch case
class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input field
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Press Button(1 to 5): ");
        int button = sc.nextInt();
        // Switch case --- conditional statement

        switch (button) {

            case 1:
                System.out.println("Sum is: " + (a + b));
                break;
            case 2:
                System.out.println("Substarction is: " + (a - b)); // Concatination with two Strings ( + )
                break;
            case 3:
                System.out.println("Multiplication is: " + (a * b));
                break;
            case 4:
                System.out.println("Division is: " + (a / b));
                break;
            case 5:
                System.out.println("Modulo is: " + (a % b));
                break;
            default:
                System.out.println("Invalid Button !");
        }
    }
}
