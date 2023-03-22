import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class NewFib {
    private static HashMap<Integer, BigInteger> fiboMap = new HashMap<Integer, BigInteger>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                // VSCode Prettier broke the following line into 2. Sorry.
                // BigInteger nthfib = (BigInteger) ((Math.pow((1 + Math.sqrt(5)) / 2, n) -
                // Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
                // We can't use this, but it's the closed form for the nth fibonacci number!
                System.out.print("What fibonacci number would you like? > ");
                int number = in.nextInt();
                long startTime = System.nanoTime();
                BigInteger result = fibo(number);
                long endTime = System.nanoTime();
                double duration = (double) (endTime - startTime) / 1000000;
                System.out.print(
                        "The " + number + "th Fibonacci number is " + result + ". Calculated in " + duration + "ms.\n");
            } catch (Exception InputMismatchException) {
                System.out.println("Good-bye.");
                break;
            } finally {
                ;
            }
        }
        in.close();
    }

    public static BigInteger fibo(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.valueOf(num);
        } else if (num < 0) {
            System.out.print("Error. No negative numbers!!! Try again.");
            return 0;
        } else if (fiboMap.containsKey(num)) {
            return (BigInteger) fiboMap.get(num);
        } else {
            fiboMap.put(num, (fibo(num - 1).add(fibo(num - 2))));
            return fiboMap.get(num);
        }
    }
}
