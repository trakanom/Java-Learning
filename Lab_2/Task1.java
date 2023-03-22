public class Task1 {
    public static void main(String[] args) {
        // FillInTheCode
        int a = 1;
        int b = 2;
        double c = 0;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);

        c = a + b;
        System.out.println("\nSetting c to the sum of a and b. New c = " + c);

        double d = a;
        System.out.println("\nDeclaring d, setting its value to a's value. New d = " + d);

        d = 4 * (a + d);
        System.out.println("\nSetting d to 4 times the sum of a and d. New d = " + d);

        c = (a + b) * 0.5;
        System.out.println("\nSetting c to the average of a and b. New c = " + c);
    }
}