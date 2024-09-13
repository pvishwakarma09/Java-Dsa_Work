// How to get input in java

// Import pakage from util class
import java.util.*;

class Main {

    public static void main(String[] args) {
        // To create a Scanner class object or Input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");

        // Declare a variable to store the input
        String name = sc.next();

        // Output the name
        System.out.println("Name is: " + name);
    }
}
