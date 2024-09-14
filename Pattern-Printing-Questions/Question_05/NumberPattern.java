
import java.util.Scanner;

/*  Number Pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
class NumberPattern {
    public static void main(String[] args) {
        // Scanner class ka object banatey hai input lene ke liye 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number of rows n: ");
        // Input fields
        int n = sc.nextInt();
        // Outer for loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); //Print Numbers  ---> yaha par string ko concatinate kiya gyaa hai
            }
            System.out.println(""); // print new line after each row 
        }
    }
}
