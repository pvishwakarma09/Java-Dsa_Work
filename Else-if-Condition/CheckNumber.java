
import java.util.Scanner;

// What is number is big
class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Number 
        System.out.println("Enter First Number a : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number b : ");
        int b = sc.nextInt();
        // conditional statement ---- if  else-if  
        if (a == b) {
            System.out.println("Number is equal !");
        } else if (a > b) {
            System.out.println("First Number is Grater !");
        } else {
            System.out.println("First Number is Lessre !");
        }
    }
}
