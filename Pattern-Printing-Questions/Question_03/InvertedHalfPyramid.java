// Inverted Half Pyramind Pattern

import java.util.Scanner;

class InvertedHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input 
        System.out.print("Enetr number of rows 'n' : ");
        int n = sc.nextInt(); // n=5

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
