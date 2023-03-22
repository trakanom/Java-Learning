import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetNumber = (int) ((Math.random()) * 99 + 1);
        System.out.println("Guess a number between 1 and 100: ");
        int uAns;
        boolean correct = false;
        while (!correct) {
            uAns = scan.nextInt();
            if (targetNumber == uAns) {
                System.out.println("Good guess! The answer was " + targetNumber);
                correct = true;
            } else if (targetNumber > uAns) {
                System.out.println("You guessed a bit low, try again!");
            } else {
                System.out.println("You guessed a bit high, try again!");
            }
        }
        scan.close();
    }
}
