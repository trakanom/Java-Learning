import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        double fTemp = scan.nextDouble();
        double cTemp = (fTemp - 32) / 1.8;
        System.out.printf("%f degrees Fahrenheit is equal to %f degrees Celsius.", fTemp, cTemp);
        scan.close();
    }
}
