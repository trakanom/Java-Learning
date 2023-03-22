import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        try {
            File curDir = new File(".");
            String path = curDir.getAbsolutePath();
            path = path.substring(0, path.length() - 1);
            String newPath = path + "input.txt";
            File input = new File(newPath);
            Scanner read = new Scanner(input);
            while (read.hasNext()) {
                String myLine = read.nextLine();
                System.out.println(myLine);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error, file not found.");
        }
    }

}
