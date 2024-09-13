// Mutiple else-if conditions... HO TOH USKO MANAGE KARNE KE LIYE HUM SWITCH CASE KA USE KARTEY HAI

import java.util.*;

class MultipleIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Imput print statement
        System.out.println("Press Button Number: ");
        int button = sc.nextInt();

        // Conditional statement
        if (button == 1) {
            System.out.println("Hello Prem !");
        } else if (button == 2) {
            System.out.println("Namastey Prem !");
        } else if (button == 3) {
            System.out.println("Bonjoure Prem !");
        } else {
            System.out.println("Invalid Button Number !");
        }
    }
}
