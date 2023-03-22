import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Birthday {
    public static void main(String[] args) throws java.text.ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        System.out.print("Enter your upcoming birthday \"mm/dd/yyyy\" > ");
        Date birthday = format.parse(in.nextLine());

        Date now = new Date();

        long milliseconds = birthday.getTime() - now.getTime();
        // if explicitly stating a long, you may add an L at the end for the literal.
        // i.e. long milliseconds = 123981908347823494870329457230L
        int seconds = (int) (milliseconds / 1000);
        milliseconds %= 1000;
        int minutes = (int) (seconds / 60);
        seconds %= 60;
        int hours = (int) (minutes / 60);
        minutes %= 60;
        int days = (int) (hours / 24);
        hours %= 24;
        if (milliseconds >= 0) {
            System.out.printf("You have a birthday in %d days, %d hours, %d minutes, %d seconds, and %d milliseconds.",
                    days, hours, minutes, seconds, milliseconds);
        } else {
            System.out.printf("You have been alive for %d days, %d hours, %d minutes, %d seconds, and %d milliseconds.",
                    -days, -hours, -minutes, -seconds, -milliseconds);
        }

    }
}
