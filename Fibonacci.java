import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args) {
		
		/*User Input*/
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
		
        System.out.print(n1 + " " + n2 + " ");

		/*Iteration for Fibonacci*/
        for (int i=0;i<count;i++) {
            n3=n2+n1;
            System.out.print(n3 + " ");
            n1=n2;
            n2=n3;
        }

    }

}