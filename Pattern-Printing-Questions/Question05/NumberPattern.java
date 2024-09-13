
import java.util.Scanner;

/*  Number Pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
// class NumberPattern {
//     public static void main(String[] args) {
//         // Scanner class ka object banatey hai input lene ke liye 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr Number of rows n: ");
//         // Input fields
//         int n = sc.nextInt();
//         // Outer for loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " "); //Print Numbers  ---> yaha par string ko concatinate kiya gyaa hai
//             }
//             System.out.println(""); // print new line after each row 
//         }
//     }
// }
// Inverted Half Pyramid with number
// class NumberPattern {
//     public static void main(String[] args) {
//         // Scanner class ka object banatey hai input lene ke liye 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr Number of rows n: ");
//         // Input fields
//         int n = sc.nextInt();
//         // Outer for loop
//         for (int i = n; i >= 1; i--) {
//             // inner loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " "); //Print Numbers  ---> yaha par string ko concatinate kiya gyaa hai
//             }
//             System.out.println(""); // print new line after each row 
//         }
//     }
// }

/* Second logic Siple HalfPyramid  
 Row           ||||      Value kaha tak likhey

1st --> i=1               1 2 3 4 5--> 5 tak print karo
2nd --> i=2               1 2 3 4 --> 4 tak print karo
3rd --> i=3               1 2 3  --> 3 tak print karo
4th --> i=4               1 2 --> 2 tak print karo
5th --> i=5               1 --> 1 tak print karo

i = n ( number of rows)   j = n - i + 1 ( j = Number of columns )
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
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " "); //Print Numbers  ---> yaha par string ko concatinate kiya gyaa hai
            }
            System.out.println(""); // print new line after each row 
        }
    }
}
