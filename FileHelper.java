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
    public static void writeToFile (String fileName, String fileText) throws IOException
    {
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        printWriter.print(fileText);
        printWriter.close();
    }

    public static String readFromFile (String fileName) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader (new FileReader(fileName));
        String fileText = bufferedReader.readLine();
        bufferedReader.close();

        return fileText;
    }

    public static int countCharacters (String fileName) throws IOException
    {
        String file = readFromFile(fileName);
        return file.length();
    }
}