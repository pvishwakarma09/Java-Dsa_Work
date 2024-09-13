// Half pyramind pattern printing 

// class HalfPyramid {
//     public static void main(String[] args) {
//         int n = 5;
//         // outer  for-Loop
//         for (int i = 1; i <= n; i++) {
//             // inner for loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" * "); // print star
//             }
//             System.out.println(" "); // print next line 
//         }
//     }
// }
// Inverted Half Pyramind Pattern
class HalfPyramid {

    public static void main(String[] args) {
        int n = 5;

        // outer  for-Loop
        for (int i = n; i >= 1; i--) {
            // inner for loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * "); // print star

            }
            System.out.println(" "); // print new line after each row 
        }
    }
}
