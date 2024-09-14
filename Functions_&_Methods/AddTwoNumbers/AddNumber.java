
import java.util.Scanner;

// Meke a Function to add 2 Numbers and return the sum
public class AddNumber {

    // Create a function
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
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
        int sum1 = CalculateSum(a, b);
        System.out.println("Sum of Two Numbers is : " + sum1);
    }
}
