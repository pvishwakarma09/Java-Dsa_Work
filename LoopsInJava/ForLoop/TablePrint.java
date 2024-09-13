
import java.util.Scanner;

// Table printing
class TablePrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input field
        System.out.println("Enter a Number which table is needed: ");
        int tab = sc.nextInt(); //input number
        // for loop

        for (int i = 1; i < 11; i++) {
            System.out.println(tab * i);
        }

    }
}
