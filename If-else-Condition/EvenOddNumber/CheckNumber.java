
import java.util.Scanner;

// Check Given Number is even and odd
class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input print statement 
        System.err.println("Enter Your Number:");
        // Input Your Number
        int num = sc.nextInt();
        // Conditional statmemt
        if (num % 2 == 0) {
            System.out.println("Number is Even !");
        } else {
            System.out.println("Number is Odd !");
        }

    }
}
