public class FillInTheCode {
    public static void main(String[] args) {
        /*
         * For each comment below, perform the described task. Then, print a sentence
         * stating which variable has changed and what its new value is, if applicable.
         * The first problem has been done for you. All steps should be done as
         * concisely as possible; use shortcut operators where possible! DO NOT delete
         * the instruction comments.
         */

        // 1. Declare an integer variable called x, and set its value to 23
        int x = 23;
        System.out.println("x has been set to " + x);

        // 2. Declare an integer variable called y, and set its value to 21
        int y = 21;
        System.out.println("y has been set to " + y);

        // 3. Declare a floating-point variable z; do not initialize it
        float z;
        System.out.println("z has been initialized without a starting value.");
        // 4. Assign to x the value x minus 8 divided by 2 (using integer division)
        x = (x - 8) / 2;
        System.out.println("x has been set to " + x);
        // 5. Assign to y the value x times 4
        y = 4 * x;
        System.out.println("y has been set to " + y);
        // 6. Increase x's value by 1, and decrease y's value by 1.
        x++;
        y--;
        System.out.println("x has been set to " + x + " and y has been set to " + y);
        // 7. Assign to y the value x times the sum of x and y
        y = x * (x + y);
        System.out.println("y has been set to " + y);
        // 8. Assign to x the quotient of the division of y by 2
        x = y / 2;
        System.out.println("x has been set to " + x);
        // 9. Assign to y the remainder of the division of y by 7
        y %= 7;
        System.out.println("y has been set to " + y);

        // 10. Assign to z the average of x, y, and 17 (without loss of precision)
        z = (float) (x + y + 17) / 3;
        System.out.println("z has been set to " + z);

        // 11. Decrement z
        z--;
        System.out.println("z has been set to " + z);
        // 12. Divide y's value by 8 (using integer division) and assign the result to
        // y.
        y /= 8;
        System.out.println("y has been set to " + y);

    }
}
