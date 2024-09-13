
import java.util.Scanner;

// Multiple else-if conditions ko hum switch case se manage kartey hai
// importing pakage from util calss
class ButtonCheck {

    public static void main(String[] args) {
        // Scanner class ka object banatey hai
        Scanner sc = new Scanner(System.in);

        // Input lene ke liye--- num is a variable ( num is a variable)
        System.out.println("Press Button Number: ");
        int num = sc.nextInt();

        // Switch case conditional statement
        switch (num) {
            case 1:
                System.out.println("Hello Prem !");
                break;
            case 2:
                System.out.println("Namastey Prem !");
                break;
            case 3:
                System.out.println("Bonjour Prem!");
                break;
            default:
                System.out.println("Invalid Button!");

        }
    }
}
