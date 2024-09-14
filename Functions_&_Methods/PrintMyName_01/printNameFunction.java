
import java.util.Scanner;

// Simple java program -- function
public class printNameFunction {

    //  argument type and name -- String name
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        // Input lene ke liye scanner class ka object banatey hai
        Scanner sc = new Scanner(System.in);
        // user input 
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        // function calling by name 
        printName("Entered name is : " + name);

    }
}
