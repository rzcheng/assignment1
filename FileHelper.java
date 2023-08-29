import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * FileHelper
 */
public class FileHelper {

    public static void writeToFile (String fileText) throws IOException
    {
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        printWriter.print(fileText);
        printWriter.close();
    }

    public static String readFromFile () throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader (new FileReader("input.txt"));
        String fileText = bufferedReader.readLine();
        bufferedReader.close();

        return fileText;
    }
}