package LectureStuff;

public class ExampleProgram {
    public static void main(String[] args) {
        // int guess = UserWrangler.nextInt("Guess");
        boolean verify = UserWrangler.nextBoolean("Celcius?");
        // float fly = UserWrangler.nextFloat("Fly? ");
        double temp = UserWrangler.nextDouble("temp: ");
        double convertedTemp = verify ? TempConversion.celsToFahr(temp) : TempConversion.fahrToCels(temp);
        // double convertedTemp = TempConversion.celsToFahr(temp);
        System.out.print(convertedTemp);
        // System.out.printf("%d %b %1.1f %f", guess, verify, fly, 2 * orNothing);

    }
}