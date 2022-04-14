public class MonthlyPayment {
    public static void main(String []args) {

        //to take input
        Scanner scan = new Scanner(System.in);
        System.out.print("Principle Amount: ");
        double p = scan.nextInt();
        System.out.print("Loan Tenure in year: ");
        double y = scan.nextInt();
        System.out.print("Rate of Interest: ");
        double r = scan.nextInt();

        //to print output
        double month = MonthlyPayment.monthlyPayment(p,y,r);
        System.out.println("Monthly Payment: " + month);

    }

    //Calculation of Monthly payment
    static double monthlyPayment(double p, double y, double r) {

        double n = 12 * y;
        double m = r / (12 * 100);
        return ((p * m) / (1- Math.pow(1+m, -n)));

    }

}