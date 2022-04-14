import java.util.Scanner;

public class PerfectNumber {
    public static void main(String []args) {

        /*For User input*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        long n = scan.nextInt();
        long sum = 0;
        int i=1;

        while (i <= n/2 ) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (n == sum) {
            System.out.println(n + " is perfect number.");}

        else {
            System.out.println(n + " is not perfect number.");
        }

    }

}
