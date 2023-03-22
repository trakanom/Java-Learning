import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of seconds: ");
        int secs = scan.nextInt();
        int original = secs;
        int hours = secs / 3600;
        secs = secs - hours * 3600;
        int mins = secs / 60;
        secs = secs - mins * 60;
        System.out.printf("%d seconds is equal to %d hours, %d minutes, and %d seconds.", original, hours, mins, secs);
        scan.close();
    }
}
