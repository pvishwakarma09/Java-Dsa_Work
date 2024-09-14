
import java.util.Scanner;

// Advanced Number pattern
class NumberPattern_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.print("Enter Number of rows 'n': ");

        int n = sc.nextInt();

        // Outer for loop
        for (int i = 1; i <= n; i++) {
            // inner loop --->> printing for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Second inner loop for printing number
            for (int k = 1; k <= i; k++) {
                System.out.print(i +" "); // print row number
            }
            System.out.println(" ");
        }
    }
}
