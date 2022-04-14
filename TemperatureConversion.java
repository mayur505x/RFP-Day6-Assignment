import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Temperature (Celsius): ");
        float n = scan.nextInt();
        System.out.println("Converted Temperature in Fahrenheit: " + conversion(n) + " F");
    }

    //Conversion Celsius to Fahrenheit
    static float conversion(float n) {

        return ((n * 9.0f / 5.0f) + 32.0f);

    }

}
