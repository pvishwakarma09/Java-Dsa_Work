// if-else conditional statement

// import pakage 
import java.util.Scanner;
// import java.util.io;

class Main {

    public static void main(String[] args) {
        // Scanner class se object banana
        Scanner sc = new Scanner(System.in);
        // Input print statement
        System.out.print("Enter your age: ");
        // input fields 
        int age = sc.nextInt();
        // conditional statement
        if (age > 18) {
            System.out.println("Welcome Eligible for Vote!");
        } else {
            System.out.println("Not Eligible for Vote!");
        }

    }
}
