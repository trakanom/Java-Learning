import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    // Circle
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");

        double radius = scan.nextDouble();
        scan.close();
        double pi = 3.14159265359;
        double area = pi * Math.pow(radius, 2);
        double circ = pi * 2 * radius;
        System.out.print("For a circle with a radius of " + radius + ", the area is equal to " + area
                + " and the circumference is " + circ + ".");
    }
}