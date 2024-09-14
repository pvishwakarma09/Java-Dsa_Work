
import java.util.Scanner;

// Advanced Diamond Pattern
class DiamondPattern {

    public static void main(String[] args) {
        // Sacnner class
        Scanner sc = new Scanner(System.in);
        // User Input 
        System.out.print("Enetr number of rows 'n': ");

        int n = sc.nextInt();   // Example n=5

        // Outer loop --> For Ist Half --- Upper half
        for (int i = 1; i <= n; i++) {
            // inner loop--> print for spaces only
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // inner loop --> print stars
            int stars = 2 * i - 1;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Outer loop --> For 2nd Half  -- Lower half
        for (int i = n; i >= 1; i--) {
            // inner loop--> print for spaces only
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // inner loop --> print stars
            int stars = 2 * i - 1;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
