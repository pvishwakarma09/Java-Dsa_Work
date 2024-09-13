// Inverted Pyramid First logic

// class InvertedPyramidRotat180Degree {
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
// Second Logic to solve or print Inverted half Pyramid rotate 180 degree
class InvertedPyramidRotat180Degree {

    public static void main(String[] args) {
        // declaire variable
        int n = 5; // n= number of rows
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
