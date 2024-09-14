
import java.util.Scanner;

/* Hollow Rectangle
* * * * *
*       *
*       *
* * * * *

 */
class HollowRectangle {

    public static void main(String[] args) {
        // Scanner class
        Scanner sc = new Scanner(System.in);
        // User input 
        System.out.print("Enetr number of rows 'n' : ");
        int n = sc.nextInt(); // n=4
        System.out.print("Enetr number of column 'm' : ");
        int m = sc.nextInt(); // m=5

        // Outer for Loop
        for (int i = 1; i <= n; i++) {
            // inner loop --- jana hamye har column ( cell ) par hai.
            for (int j = 1; j <= m; j++) {
                // cells -->> ( i , j )
                // logic lagana hai boundary condition ke liye jo tumne find ki hai [ i=1 , i=n , j=1 , j=m ]
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*"+" "); // yeh star print ho jayega-- println nahi lagega--> same line main print karna hai 
                } else {
                    System.out.print(" ");  // Yeh space print karwane ke liye hai.. -- Right side main lane ke liye 
                }
            }
            System.out.println(" "); // Yeh next line print karane ke liye hai
        }
    }
}
