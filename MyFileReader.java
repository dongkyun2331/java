import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class MyFileReader {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        try {
            FileInputStream is = new FileInputStream(args[0]);
            System.out.println("Read Success");
            StringBuilder input = new StringBuilder();
            int i;
            int number = 0;
            while ((i = is.read()) != -1) {
                input.append((char) i);
            }
            System.out.println("File's input: " + input);

            StringTokenizer tokenizer = new StringTokenizer(input.toString(), " ");
            while (tokenizer.hasMoreTokens()) {
                number++;
                System.out.println(number + ": " + tokenizer.nextToken());
            }
            System.out.println(number + " data values were read");
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}