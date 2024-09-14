
import java.util.Scanner;
// Advanced Palindrome Number Pattern

class PalindromeNumber {

    public static void main(String[] args) {
        // Scanner class
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.print("Enter number of rows 'n' : ");
        int n = sc.nextInt();
        // outer for loop-->  print next line or outer loop for each row 
        for (int i = 1; i <= n; i++) {
            // inner loop--> print spaces or Double space to separate numbers more
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Second inner loop -->> Print Number Ist Half or print palindrome pattern in a single loop
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Third inner loop -->> Print Number IInd  Half
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            // for start contion k=1 
            // for (int k = 1; k <= i; k++) {
            //     System.out.print(k);
            // }
            // move to the next line
            System.out.println(" ");
        }
    }
}
// // Second logic
// import java.util.Scanner;

// // Palindrome Pattern with Single Loop and StringBuilder
// class PalindromeNumber {
//     public static void main(String[] args) {
//         // Scanner for user input
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows 'n' : ");
//         int n = sc.nextInt();
//         // outer loop for each row
//         for (int i = 1; i <= n; i++) {
//             StringBuilder row = new StringBuilder();
//             // append leading spaces
//             for (int j = 1; j <= (n - i); j++) {
//                 row.append("  ");  // Double space for wider gap
//             }
//             // append decreasing part (first half)
//             for (int j = i; j >= 1; j--) {
//                 row.append(j).append(" ");
//             }
//             // append increasing part (second half)
//             for (int j = 2; j <= i; j++) {
//                 row.append(j).append(" ");
//             }
//             // print the complete row
//             System.out.println(row.toString());
//         }
//     }
// }

