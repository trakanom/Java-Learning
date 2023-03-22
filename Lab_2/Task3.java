import java.util.Scanner;
import java.text.MessageFormat;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean failure = false;
        String ansLine = "";
        int ansInt = 0;
        boolean ansBool = false;

        System.out.print(
                "As you walk across a bridge, you notice a figure emerging from the fog.\nHe blocks your way and declares: \"To get past me, you must answer these questions three!\"\n");
        System.out.print("\"First! What is your name?\"\n");
        try {
            ansLine = scan.nextLine();
        } catch (Exception InputMismatchException) {
            failure = true;
        } finally {
            if (!failure) {
                String result = MessageFormat.format(
                        "\"Hmm... Yes, I do believe your name is {0}. Very well.\"\n\"Next question! What integer do you think is closest to the airspeed velocity of a coconut-laden swallow?\"\n",
                        ansLine);
                System.out.print(result);
                try {
                    ansInt = scan.nextInt();
                } catch (Exception InputMismatchException) {
                    failure = true;
                } finally {
                    if (!failure) {
                        System.out.printf(
                                "The figure exclaims: \"HahahaHeeHaHa! I can't believe you thought the answer was %d! INCORRE-\"\n...\n...\n\"Wait, you said I worded the question poorly? That you're technically correct?\"\n\"...\"\n\"FINE. We shall move on to the last question.\"\n\"Your favorite color is pink. True or false?\"\n",
                                ansInt);
                        try {
                            ansBool = scan.nextBoolean();
                        } catch (Exception InputMismatchException) {
                            failure = true;
                        } finally {
                            if (!failure) {
                                String lastResult = MessageFormat.format(
                                        "\"Wait, your favorite color {0} actually pink?!? I don't b-Aaaaaaaaaaaaaaaaaa\"\nThe bridge suddenly lurches and the figure falls into the depths below. You can still hear him screaming. Wordlessly, you finish crossing the bridge.",
                                        (ansBool ? "is" : "isn't"));
                                System.out.println(lastResult);
                            }
                        }
                    }
                }
            }
        }
        if (failure) {
            System.out.print("You have been ejected from the bridge. Try again next life. (Hint: wrong data type)");
        }
        scan.close();
    }
}