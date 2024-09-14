
import java.util.Scanner;

// Meke a Function to multiply 2 Numbers and return the multiplication
public class MulNumber {

    // Create a function
    public static int CalculateMul(int a, int b) {
        // int mul = a * b;
        // return mul;
        return a * b;
    }

    public static void main(String[] args) {
        // " We create an object of the Scanner class to take input from the user."
        Scanner sc = new Scanner(System.in);
        // To take input from the user.
        System.out.print("Enter First Number 'a' : ");
        int a = sc.nextInt(); // a=5
        System.out.print("Enter Second Number 'b' : ");
        int b = sc.nextInt(); // b=6

        // Function calling
        int mul1 = CalculateMul(a, b);
        System.out.println("Product of Two Numbers is : " + mul1);
    }
}
