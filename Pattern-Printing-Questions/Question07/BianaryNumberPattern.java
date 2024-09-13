// 0-1 Triangle Pattern

import java.util.Scanner;

class BianaryNumberPattern {

    public static void main(String[] args) {
        // Creating an object from scanner class

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Number of rows 'n': ");
        // input fields 
        int n = sc.nextInt();

        // outer for loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j; // declaire sum variable 
                if (sum % 2 == 0) {
                    System.out.print("1" + " "); // This is an even value 
                } else {
                    System.out.print("0" + " "); // This is an odd value 
                }
            }
            System.out.println(" ");
        }

    }
}
