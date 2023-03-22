import java.lang.Math;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which fibonacci number would you like? ");
        int n = in.nextInt();
        int nthfib = (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
        System.out.printf("The %d'th Fibonacci number is %d.", n, nthfib);
        in.close();
    }
    // Memoization:
    //     Fibdict = {'0':0, '1':1, '2':1}
    //     def Fibonacci(int n):
    //         if str(n) in Fibdict.keys():
    //             return Fibdict[str(n)]
    //         else:
    //             return Fibdict[str(n-1)]+Fibdict[str(n-2)]

}
