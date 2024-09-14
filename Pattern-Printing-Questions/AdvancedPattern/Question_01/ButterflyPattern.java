
import java.util.Scanner;

// Advanced Pattern printing Problem --- ButterFly Pattern
class ButterflyPattern {

    public static void main(String[] args) {
        // Scanner class
        Scanner sc = new Scanner(System.in);

        // User Input 
        System.out.print("Enter Number of rows 'n' : ");
        int n = sc.nextInt();

        // Outer For-loop ---->>  First -> Upper half
        // This loop starts from ' 1 ' and goes up to ' n ' , increasing by ' 1 'each time.
        for (int i = 1; i <= n; i++) {
            // first Part printing star --> inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Second inner loop for priting spaces
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // 2nd Part printing star --> inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Outer For-loop ---->>  Second -> Lower half
        // This loop starts from ' n ' and goes down to ' 1 ' , decreasing by ' 1 'each time.
        for (int i = n; i >= 1; i--) {
            // first Part printing star --> inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Second inner loop for priting spaces
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // 2nd Part printing star --> inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
