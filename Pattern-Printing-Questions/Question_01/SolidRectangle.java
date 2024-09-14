
import java.util.Scanner;

/* Solid Rectangle Pattern Printing

* * * * * *  // Row 5 hai
* * * * * *
* * * * * *
* * * * * *
* * * * * *  // Coulumn 6 hai
 */
// Simple for-loop lagakey hum yeh patternn print kartey hai
// class SolidRectangle {
//     public static void main(String[] args) {
//         // for loop
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("* * * * * *");
//         }
//     }
// }

// Second method Nested for-loop uses
// User se input lekar hum pattern print kara saktey hai
class SolidRectangle {

    public static void main(String[] args) {

        // Scanner class ka object banatye hai
        Scanner sc = new Scanner(System.in);
        // For user input ------ >>> input fields
        System.out.print("Enter Number of rows 'n' : ");
        int n = sc.nextInt();
        System.out.print("Enter Number of column 'm' : ");
        int m = sc.nextInt();

        // Nested for loop ---- row and column
        // Outer Loop --- Row Print karane ke liye
        for (int i = 1; i <= n; i++) {
            // Inner Loop --- Column print karane ke liye
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
