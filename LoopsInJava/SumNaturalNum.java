
import java.util.Scanner;

//  10 tak ke natural numbers ka sum kya hoga
class SumNaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print input statement
        System.out.println("Enter n Natural Number: ");
        int n = sc.nextInt();
        int sum = 0;

        // for-loop
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
            // har i ke liye sum print hoga i=0, i=1 , i=2 , i=3  ke liye ( agar n ki value 3 hai toh )
            // System.out.println("Sum of n natural Number is : " + sum);
        }
        // Loop terminate karne ke baad sab value ka sum ayega 
        System.out.println("Sum of n natural Number is : " + sum);
    }
}
