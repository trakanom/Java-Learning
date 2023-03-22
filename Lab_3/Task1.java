package Lab_3;

// import java.util.Scanner;
import java.awt.Point;

public class Task1 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(0, 2);
        double area = aTriangle.area(a, b, c);
        System.out.println("The area of your triangle is " + area);

        // in.close();
    }
}
