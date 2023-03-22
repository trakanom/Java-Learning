import java.util.Scanner;

public class Part_2 {
    static double distFunc(double xStart, double yStart, double xEnd, double yEnd) {
        double dist = Math.sqrt(Math.pow(xEnd - xStart, 2) + Math.pow(yEnd - yStart, 2));
        return dist;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x0 = 0;
        double y0 = 0;
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        for (int i = 0; i <= 5; i++) {
            switch (i / 2) {
                case 0:
                    System.out.print("Please enter your first " + (i % 2 == 0 ? "x" : "y") + " value. >> ");
                    if (i % 2 == 0) {
                        x0 = scan.nextDouble();
                    } else {
                        y0 = scan.nextDouble();
                    }
                    break;
                case 1:
                    System.out.print("Please enter your second " + (i % 2 == 0 ? "x" : "y") + " value. >> ");
                    if (i % 2 == 0) {
                        x1 = scan.nextDouble();
                    } else {
                        y1 = scan.nextDouble();
                    }
                    break;
                case 2:
                    System.out.print("Please enter your last " + (i % 2 == 0 ? "x" : "y") + " value. >> ");
                    if (i % 2 == 0) {
                        x2 = scan.nextDouble();
                    } else {
                        y2 = scan.nextDouble();
                    }
                    break;
            }
        }
        System.out.printf("Our coordinates are (%5.3f,%5.3f), (%5.3f,%5.3f), and (%5.3f,%5.3f).\n", x0, y0, x1, y1, x2,
                y2);
        double firstPair = distFunc(x0, y0, x1, y1);
        double secondPair = distFunc(x1, y1, x2, y2);
        double thirdPair = distFunc(x0, y0, x2, y2);

        System.out.printf("The distance between (%5.3f,%5.3f) and (%5.3f,%5.3f) is %5.3f.\n", x0, y0, x1, y1,
                firstPair);
        System.out.printf("The distance between (%5.3f,%5.3f) and (%5.3f,%5.3f) is %5.3f.\n", x1, y1, x2, y2,
                secondPair);
        System.out.printf("The distance between (%5.3f,%5.3f) and (%5.3f,%5.3f) is %5.3f.\n", x0, y0, x2, y2,
                thirdPair);
        System.out.printf("The perimeter of the triangle these points form is %5.3f.",
                firstPair + secondPair + thirdPair);
        scan.close();

    }
}