// Half Pyramid Rotate-180-degree First logic

// class Half_Pyr_Rotat180Degree {
//     public static void main(String[] args) {
//         // declaire variable
//         int n = 4;
//         // outer for-loop
//         for (int i = 1; i <= n; i++) {
//             // inner for loop
//             for (int j = n; j >= i; j--) {
//                 // print left side space --- inverted pattern
//                 System.out.print(" ");
//             }
//             // inside outer loop for printing star -- increasing order
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");  // print new line after each row 
//         }
//     }
// }
// Second Logic to solve or print half Pyramid rotate 180 degree
import java.util.Scanner;

class Half_Pyr_Rotat180Degree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input 
        System.out.print("Enetr number of rows 'n' : ");
        int n = sc.nextInt(); // n=5
        // outer -loop
        for (int i = 1; i <= n; i++) {
            // first inner loop -- Print spaces only
            for (int j = 1; j <= n - i; j++) {
                // print left side space --- inverted HalfTriangle pattern
                System.out.print(" ");
            }
            // Second ineer loop --- Print star only
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");  // print new line after each row 
        }

    }
}
