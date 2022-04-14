import java.util.Scanner;

class Reverse {
    public static void main(String []args) {
	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = scan.nextInt();

        int rev=0;

        while(a!=0) {
		
            int rem = a%10;
            rev = rev * 10 + rem;
            a = a/10;

        }

        System.out.println("Reverse value:" + rev );

    }
	
}