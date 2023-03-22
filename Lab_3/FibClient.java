package Lab_3;

import java.util.Scanner;

public class FibClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What fibonacci number would you like?");
        int number = in.nextInt();
        // NewFib fibstuff = new NewFib();
        int result = NewFib().fibo(number);
        System.out.print("The " + number + "th Fibonacci number is " + result);
    }
}
