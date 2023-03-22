import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userinput = "";
        String reversed = "";
        // String ending = "";
        while (true) {
            System.out.print("Please input a word to reverse. >>>  ");
            userinput = in.nextLine().toUpperCase();
            if (userinput.equals("QUIT")) {
                System.out.println("Good-bye.");
                break;
            } else {
                reversed = bananaDrome(userinput);
                // ending = ;
                System.out
                        .println("Your input word " + userinput + " is " + reversed + " after this method is applied. "
                                + userinput + (reversed.equals(userinput) ? " DOES " : " DOES NOT ")
                                + "satisfy the property we are looking for.");
            }
        }
        in.close();
    }

    public static String reverseMe(String inputString) {
        char[] reverseMe = inputString.toCharArray();
        String answerString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            answerString += reverseMe[i];
        }
        return answerString;
    }

    public static String bananaDrome(String inputString) {
        String fixed = inputString.substring(1, inputString.length()) + inputString.substring(0, 1);
        String eversed = reverseMe(fixed);
        return eversed;
    }

}
