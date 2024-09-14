// Meke a Function to find factorial of given number

import java.util.Scanner;

public class Factorial {

    // Create a function
    public static void calculateFactorial(int n) {

        // invalid statement
        if (n < 0) {
            System.out.println("Invalid Statement Please enter Number is Greater than 0");
            return; //"The loop terminates when a return statement is executed."
        }
        // for loop
        int factorial = 1; //Starting value 

        for (int i = n; i >= 1; i--) {
            factorial *= i; // factorial = factorial * i
        }
        System.out.println("factorial of given number is : " + factorial);
        return;
    }

    public static void main(String[] args) {
        // " We create an object of the Scanner class to take input from the user."
        Scanner sc = new Scanner(System.in);
        // To take input from the user.
        System.out.print("Enter Number 'n' : ");
        int n = sc.nextInt(); // n=5

        // Function calling
        calculateFactorial(n);

    }
}
