import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = scan.nextInt();
        System.out.println("Enter another integer:");
        int b = scan.nextInt();
        System.out.println("Enter the last integer:");
        int c = scan.nextInt();
        double average = (float) (a + b + c) / 3;
        System.out.println("The average of the integers you entered is " + average);
        scan.close();
    }
}
