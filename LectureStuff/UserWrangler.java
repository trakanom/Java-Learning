package LectureStuff;

import java.util.Scanner;

public class UserWrangler {
    private static Scanner in = new Scanner(System.in);

    public static int nextInt(String prompt) {
        System.out.print(prompt + " > ");
        return in.nextInt();
    }

    public static boolean nextBoolean(String prompt) {
        System.out.print(prompt + " > ");
        return in.nextBoolean();
    }

    public static String nextLine(String prompt) {
        System.out.print(prompt + " > ");
        return in.nextLine();
    }

    public static float nextFloat(String prompt) {
        System.out.print(prompt + " > ");
        return in.nextFloat();
    }

    public static double nextDouble(String prompt) {
        System.out.print(prompt + " > ");
        return in.nextDouble();
    }
    // %c character
    // %d decimal (integer) number (base 10)
    // %e exponential floating-point number
    // %f floating-point number
    // %i integer (base 10)
    // %o octal number (base 8)
    // %s String
    // %u unsigned decimal (integer) number
    // %x number in hexadecimal (base 16)
    // %t formats date/time
    // %% print a percent sign
    // \% print a percent sign
}
