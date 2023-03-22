package Lab_3;

import java.awt.Point;

public class aTriangle {
    static double dist(Point a, Point b) {
        System.out.println(a + " uh " + b);
        return Math.sqrt(Math.pow((double) (b.x - a.x), 2) + Math.pow((double) (b.y - a.y), 2));
    }

    static double area(Point a, Point b, Point c) {
        double side1 = dist(a, b);
        double side2 = dist(a, c);
        double side3 = dist(b, c);
        double pArea = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(pArea * (pArea - side1) * (pArea - side2) * (pArea - side3));
        return area;
    }
}
