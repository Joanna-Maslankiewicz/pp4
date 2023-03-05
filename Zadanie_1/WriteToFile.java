import java.io.IOException;
import java.io.*;

public class WriteToFile {
    public static void WriteTextToFile(String text, String filename) {
        try {
            FileWriter write = new FileWriter(filename, true);
            write.write(text + "\n");
            write.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku" + filename + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        WriteTextToFile("nowa linijka", "C:\\Users\\Joanna\\OneDrive\\Pulpit\\pp4\\pp4\\testfile.txt");
    }
}
