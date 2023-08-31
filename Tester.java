import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        FileHelper.readFromFile("Text.txt");
        FileHelper.writeToFile("Text.txt", "test");
        System.out.println(FileHelper.countCharacters("Text.txt"));
    }
}
