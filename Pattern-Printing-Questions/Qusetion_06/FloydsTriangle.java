
import java.util.Scanner;

// Floyds Triangle
class FloydsTriangle {

    public static void main(String[] args) {
        // Input lene ke liye sacnner class ka obejct banatey hai
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows 'n' : ");
        // Take input variable n
        int n = sc.nextInt();
        int num = 1; // Daclaire a variable whose name is 'num'
        // Outer for loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // num=num+1
            }
            System.out.println(" "); //Print next line of each row
        }

    }
}
