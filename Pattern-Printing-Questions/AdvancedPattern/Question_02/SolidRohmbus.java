
import java.util.Scanner;

// Advanced SolidRohmbus Pattern
class SolidRohmbus {

    public static void main(String[] args) {
        // scanner class
        Scanner sc = new Scanner(System.in);

        // user Input 
        System.out.print("Enter Number of rows 'n': ");
        int n = sc.nextInt();

        // Outer for loop
        for (int i = 1; i <= n; i++) {
            // inner loop -->>> for printing spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Inner loop --->> Priting Star
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
