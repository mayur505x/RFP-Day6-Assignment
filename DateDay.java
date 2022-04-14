import java.util.*;

public class DateDay {

    public static void main(String[] args) {

        int d, m, y;
        Scanner s = new Scanner(System.in);
        System.out.print("enter date in 'DD MM YYYY' format: ");
        d = s.nextInt();
        m = s.nextInt();
        y = s.nextInt();
        System.out.println("day is: " + DateDay.dayOfWeek(d, m, y));
        s.close();

    }
	
	//takes a date as input andprints the day of the week that date falls on
    static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

		//for Day
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        return d0;

    }

}
